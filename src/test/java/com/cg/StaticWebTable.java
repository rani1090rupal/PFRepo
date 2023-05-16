package com.cg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {
	
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
driver.manage().window().maximize();
String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]")).getText();
System.out.println(innerText);
String innerText1 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr/td")).getText();
System.out.println(innerText1);
String innerText2 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText();
System.out.println(innerText2);
String innerText3 = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td")).getText();
System.out.println(innerText3);

}

}




