package com.cg;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search
{
static
{
//path to the driver executable must be set by the webdriver.chrome.driver system property;
System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException
{
//Create a instance of the Chrome Driver
WebDriver driver= new ChromeDriver();
//to visit google use this
driver.get("https://www.google.com");

driver.manage().window().maximize();//to maximize the current window

//to pause for 2seconds
Thread.sleep(2000);

//find the text input element by it's name
WebElement element=driver.findElement(By.name("q"));


//enter value inside the input box to search
element.sendKeys("Apple");

//Now submit the form, web driver will find the form for us from the element
element.submit();


//Check the title and URL of the page
System.out.println("Page title is : "+driver.getTitle());
System.out.println("Page URL is: "+driver.getCurrentUrl());
//System.out.println(driver.getPageSource());


//Close the browser
driver.quit();
}

}