package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
                                     //CreateLead
	public static String[][] readData(String filename) throws IOException {
		//Open the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+filename+".xlsx");

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
		
		
		String[][] data=new String[rowCount][columnCount];
		
		//Retrieve the entire data
		//1     2
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			//XSSFRow row1 = ws.getRow(2);
			for (int j = 0; j < columnCount; j++) {
				String allValues = row.getCell(j).getStringCellValue();
				data[i-1][j]=allValues;
				//String allValues = row(1).getCell(0).getStringCellValue();//TestLeaf    data[0][0]=TestLeaf
				//String allValues = row(1).getCell(1).getStringCellValue();// Bhuvanesh  data[0][1]=Bhuvanesh
				////String allValues = row(1).getCell(2).getStringCellValue();//Moorthy   data[0][2]=Moorthy
				
				//String allValues = row(2).getCell(0).getStringCellValue();//Qeagle      data[1][0]=Qeagle;  
				//String allValues = row(2).getCell(1).getStringCellValue();//Harrish     data[1][1]=Harrish;
				//String allValues = row(2).getCell(2).getStringCellValue();//A           data[1][2]=allValues;
				System.out.println(allValues); 
			}
		}
		wb.close();
		return data;
		
	}

}
