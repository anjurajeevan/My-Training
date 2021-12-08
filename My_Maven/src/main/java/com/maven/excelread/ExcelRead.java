package com.maven.excelread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static FileInputStream file;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	
	public static String readStringData(int i , int j) throws IOException{
		file= new FileInputStream("C:\\Users\\Prajith\\eclipse-workspace\\Trainingjava\\test.xlsx");
		wb= new XSSFWorkbook(file);
		sheet= wb.getSheet("Sheet1");
		Row r = sheet.getRow(i);
		Cell c= r.getCell(j);
		
		return c.getStringCellValue();
		
	}
	public static String readIntegerData(int i , int j) throws IOException {
		file= new FileInputStream("C:\\Users\\Prajith\\eclipse-workspace\\Trainingjava\\test.xlsx");
		wb= new XSSFWorkbook(file);
		sheet= wb.getSheet("Sheet1");
		Row r = sheet.getRow(i);
		Cell c= r.getCell(j);
		
		int var = (int)c.getNumericCellValue();
		return String.valueOf(var);
	}

}
