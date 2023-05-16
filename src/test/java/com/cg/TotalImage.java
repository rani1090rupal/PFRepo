package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/image/trending?form=Z9LH");
		driver.manage().window().maximize();
		List<WebElement> image_list=driver.findElements(By.tagName("img"));
		System.out.println("total no of image"+image_list.size());
	}

}
