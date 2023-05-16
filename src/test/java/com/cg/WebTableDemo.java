
package com.cg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		
		//objective ;
		//fetch the list of all company names
		//fatch all list of the current price
		
		List<WebElement>allcompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement>allcurrentprices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		String searchcompany="India Cements Capita";
		
		for(WebElement e:allcompanies)
		{
			if(e.getText().equalsIgnoreCase(searchcompany))
			{
				int index=allcompanies.indexOf(e);
				System.out.println(allcurrentprices.get(index).getText());
				break;
			}
		}
	}

}
