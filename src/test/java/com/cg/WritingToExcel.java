package com.cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingToExcel { 
	
	public static void main(String[] args) throws IOException {
		
FileInputStream ip=new FileInputStream("./Demo.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(ip);
XSSFSheet sh=wb.getSheet("TestData");
sh.getRow(1).createCell(3).setCellValue("fail");
FileOutputStream out=new FileOutputStream("./Demo.xlsx");
wb.write(out);
System.out.println("Data Written in file...!!");

wb.close();
out.close();
ip.close();

}
}

