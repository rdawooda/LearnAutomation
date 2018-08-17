package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public ExcelDataProvider()
	{
		File scr = new File("./ApplicationTestData/AppData.xlsx");
		
		
		try {
			FileInputStream fis = new FileInputStream(scr);
			wb = new XSSFWorkbook(fis);
			}
			catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is "+e.getMessage());
		}
		
	}
	
	
	
	public String getData(int sheetIndex, int row, int column)
	{
		System.out.println("Entering into the method ");
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		System.out.println("Value of data is "+data);
		return data;
		
	}
	
	public String getData(String sheetName, int row, int column)
	{
		System.out.println("Enetring into the data ");
		String data = wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
		System.out.println("Value is "+data);
		return data;
		
	}

}
