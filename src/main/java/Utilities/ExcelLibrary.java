package Utilities;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {

	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelLibrary() throws Exception  {
		
		String excelPath = "src\\test\\resources\\test_data\\test_data_info.xlsx";
		File file = new File(excelPath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		
	}
	
	
	public String readStringData(String sheetName, int row , int col) {
		
		sheet = wb.getSheet(sheetName);
		String data = sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	
	public String readIntData(String sheetName, int row , int col) {
		sheet = wb.getSheet(sheetName);
		int int_phone =  (int) sheet.getRow(row).getCell(col).getNumericCellValue();
		String str_phone = String.valueOf(int_phone);
		return str_phone;
	}
}
