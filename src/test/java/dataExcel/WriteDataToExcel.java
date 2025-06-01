package dataExcel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataToExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\DataDynamic.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");
		System.out.println("enter noof Rows");
		Scanner scan=new Scanner(System.in);
		int NoofRows=scan.nextInt();
		System.out.println("enter noof cells");
		int NoofCells=scan.nextInt();
		for(int r=0;r<=NoofRows;r++) {
			XSSFRow currentRow=sheet.createRow(r);
			
			for(int c=0;c<NoofCells;c++) {
				XSSFCell Cell=currentRow.createCell(c);
				Cell.setCellValue(scan.next());
				
			}
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("workbooksuccessfully created");
		
		

	}

}
