package dataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RetriveDataExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int totalRows= sheet.getLastRowNum();
	int totalCoumns=sheet.getRow(1).getLastCellNum();
	for(int r=0;r<=totalRows;r++) {
		XSSFRow currentRow=sheet.getRow(r);
		for(int c=0;c<totalCoumns;c++) {
			XSSFCell cell=currentRow.getCell(c);
			System.out.println(cell.toString());
		}
	}
	workbook.close();
	file.close();

	}

}
