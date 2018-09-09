package sunnyTestng;

import java.util.ArrayList;

public class RetrivalJi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExcelRetrival excelRetrival=new ExcelRetrival();
	ArrayList<String> cl=	excelRetrival.getData("Homepage");
	System.out.println(cl.get(0));
	System.out.println(cl.get(1));
	System.out.println(cl.get(2));
	System.out.println(cl.get(3));
	}

}
