package com.automation.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	 static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFCell cell;
	static XSSFRow row;
	
	public static Integer getrowcount(String filename, String Sheetname) throws IOException {
	try {
		fis = new FileInputStream(filename);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(Sheetname);
		int tRow = sheet.getLastRowNum() +1;
		wb.close();
		return tRow;
	}
	
	catch(Exception e){
		return 0;
		}
	}
	public static Integer getcellcount(String filename, String Sheetname) throws IOException {
		try {
			fis = new FileInputStream(filename);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(Sheetname);
			int  tcell = sheet.getRow(0).getLastCellNum();
			wb.close();
			return tcell;
		}
		
		catch(Exception e){
			return 0;
			}
		}
	public static String getcellValue(String filename, String Sheetname, int rownum , int cellnum) throws IOException {
		try {
			fis = new FileInputStream(filename);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet(Sheetname);
			 cell = wb.getSheet(Sheetname).getRow(rownum).getCell(cellnum);
			 wb.close();
			return cell.getStringCellValue();
		}
		
		catch(Exception e){
			return "";
			}
		}
	
}
