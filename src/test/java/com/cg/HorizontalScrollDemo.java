package com.cg;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScrollDemo { 
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_menu_hor_scroll");
//switch driver's focus to the frame
driver.switchTo().frame("iframeResult");
WebElement e=driver.findElement(By.xpath("//a[text()='Work']"));
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView()", e );
}}



