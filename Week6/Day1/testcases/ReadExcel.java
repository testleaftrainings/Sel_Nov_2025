package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");

		//Open the worksheet
		XSSFSheet ws = wb.getSheet("Sheet1");
		
		//To count the number of row
		//With header-row1 not required
		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is: "+rowCount);
		
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("physicalNumberOfRows: "+physicalNumberOfRows);
		
		//To count the column
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The column count is: "+columnCount);
		
		//Retrieve 1 value
		String row1Cell1Data = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("row1Cell1Data: "+row1Cell1Data);
		
		//Retrieve the entire data
		//1     2
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			//XSSFRow row1 = ws.getRow(2);
			for (int j = 0; j < columnCount; j++) {
				String allValues = row.getCell(j).getStringCellValue();
				//String allValues = row(1).getCell(0).getStringCellValue();//TestLeaf
				//String allValues = row(1).getCell(1).getStringCellValue();// Bhuvanesh
				////String allValues = row(1).getCell(2).getStringCellValue();//Moorthy
				
				//String allValues = row(2).getCell(0).getStringCellValue();//Qeagle
				//String allValues = row(2).getCell(1).getStringCellValue();//Harrish
				//String allValues = row(2).getCell(2).getStringCellValue();//A
				System.out.println(allValues);
			}
		}
		
		
	}

}
