
package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker{
	public static void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
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
		
		
	}
}
