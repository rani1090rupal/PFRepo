package com.cg;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Showaddress {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(" https://www.bing.com/ ");
		//driver.findElement(By.name("q")).sendKeys("Capgemini India");
		driver.findElement(By.xpath("//input[@type='search'][@name='q']")).sendKeys("Capgemini India");
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
		List<WebElement>alladdress=driver.findElements(By.xpath("//div[@class='b_factrow']"));
		System.out.println("total address"+alladdress.size());
		
		for(WebElement e:alladdress)
			System.out.println(e.getText());
		
	}

}
