package com.cg;

import java.util.List;

import org.openqa.selenium.By; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravelDatePicker{

    public static void main(String[] args) {      
         System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.path2usa.com/travel-companions");
         driver.manage().window().maximize();
         //click into the travel date filed

         driver.findElement(By.xpath("//input[@name='travel_date']")).click();
         List<WebElement> alldays=driver.findElements(By.className("day"));
         System.out.println("Total active days:"+ alldays.size());
         for(WebElement e: alldays)
         {
         if(e.getText().equals("13"))
         {
         e.click();
         break;

         }
         }
         WebElement laugddrp=driver.findElement(By.xpath("//select[@id='travel_language']"));
         laugddrp.sendKeys("Hindi");
         Select select=new Select(laugddrp);
         driver.findElement(By.xpath("//button[@onclick='document.searchform.submit();']")).click();
    }
}