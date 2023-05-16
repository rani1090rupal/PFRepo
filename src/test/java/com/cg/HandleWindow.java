package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
WebDriver driver;

public HandleWindow()
{
System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
}
public void loadUrl()
{
driver.get("https://www.myntra.com/");
}
public void handleWindows()
{
WebElement men=driver.findElement(By.xpath("//a[text()='Men'][@class='desktop-main']"));
men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));// open men link into new tab

WebElement women=driver.findElement(By.xpath("//a[text()='Women'][@class='desktop-main']"));
women.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));// open men link into new tab

WebElement kids=driver.findElement(By.xpath("//a[text()='Kids'][@class='desktop-main']"));
kids.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));// open men link into new tab

WebElement beauty=driver.findElement(By.xpath("//a[text()='Beauty'][@class='desktop-main']"));
beauty.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));// open men link into new tab

WebElement homestop=driver.findElement(By.xpath("//a[text()='Homestop'][@class='desktop-main']"));
homestop.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));// open men link into new tab


Set<String> allwinids=driver.getWindowHandles();

List<String> allwin=new ArrayList<String>(allwinids);

System.out.println("Total win ids: "+allwinids.size());
for(String s: allwin)
System.out.println(s);

System.out.println("Before switch title: "+driver.getTitle());
driver.switchTo().window(allwin.get(1));
System.out.println("After switch title: "+driver.getTitle());

}
}