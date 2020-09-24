package ExcelTest;

import ExcelUse.Xls_Reader;

public class ExcelUtilTest {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Thinksysuser\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\ExcelUse\\Excelsheet.xlsx");
		String sheetname = "Login";
		String data = reader.getCellData(sheetname, 0, 2);
		System.out.println(data);
		int rowcount = reader.getRowCount(sheetname);
		System.out.println(rowcount);
		// reader.addColumn(sheetname, "Status");
		// reader.addSheet("Registration");
		System.out.println(reader.isSheetExist(sheetname));
	    reader.setCellData(sheetname, "Status", 2, "PASS");
	    System.out.println(reader.getColumnCount(sheetname));
	    System.out.println(reader.getCellData("Registration", "PhoneNumber", 2));
	    System.out.println(reader.getCellData("Registration", "Age", 2));
	    
		
	}

}
