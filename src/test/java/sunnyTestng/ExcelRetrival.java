package sunnyTestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRetrival {

	public  ArrayList<String> getData(String testCaseName) throws Exception{
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		File src=new File("C:\\Users\\himanshu\\Desktop\\Sunny.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheetno=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetno;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testData")) {
				
				XSSFSheet sheet=workbook.getSheetAt(i);
			Iterator<Row> rw=	sheet.iterator();
			Row row=rw.next();
			Iterator<Cell> ce=	row.cellIterator();
			int k=0;
			int column=0;
			while(ce.hasNext()) {
				
				Cell cell=ce.next();
				if(cell.getStringCellValue().equalsIgnoreCase("testData")) {
					column=k;
				}
				k++;
			}
			System.out.println(column);
			
			while(rw.hasNext()) {
				Row ro=rw.next();
				if(ro.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
				
				Iterator<Cell> cel=	ro.iterator();
				while(cel.hasNext()) {
					Cell cell1=cel.next();
					if(cell1.getCellTypeEnum()==CellType.STRING) {
						al.add(cell1.getStringCellValue());
					}
					else {
					al.add(NumberToTextConverter.toText(cell1.getNumericCellValue()));
					}
				}
				}
			}
			}
	
		}
		return al;
		
		
	}

}
