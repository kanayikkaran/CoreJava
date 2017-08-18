package com.java.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POISample {

	public static void main(String[] args) {
		
		String file = "./TestSpreadsheet.xlsx";
		
		try {
			FileInputStream fis = null;
			XSSFWorkbook workbook = null;
			XSSFSheet sheet = null;
			XSSFRow row = null;
			XSSFCell cell = null;
			fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
			fis.close();
			
			sheet = workbook.getSheetAt(0);
			for(int i=0; i<sheet.getPhysicalNumberOfRows(); i++)
			{
			row=sheet.getRow(i);
			for(int j=0; j<row.getLastCellNum(); j++)
			{
				cell = row.getCell(j);
				System.out.print(cell.getStringCellValue()+"\t");
			}
			System.out.println();
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found : "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception : "+e.getMessage());
		}

	}

}
