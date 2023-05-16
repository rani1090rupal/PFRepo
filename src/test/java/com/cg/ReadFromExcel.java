package com.cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadFromExcel {



public static void main(String[] args) throws IOException {

//1. connection bet java and file

FileInputStream ip=new FileInputStream("./Demo.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(ip);

XSSFSheet sh=wb.getSheet("TestData");

System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
System.out.println(sh.getRow(0).getCell(2).getStringCellValue());

int rowsize=sh.getPhysicalNumberOfRows();
int colsize=sh.getRow(0).getPhysicalNumberOfCells();
System.out.println("Row size:"+rowsize);
System.out.println("Col size:"+colsize);
System.out.println("---------Reading all data form the Sheet ---------");
for(int i=0;i<rowsize;i++)
{
for(int j=0;j<colsize;j++)
{
System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+" ");
}
System.out.println();
}

wb.close();
ip.close();

}



}