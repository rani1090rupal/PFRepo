
package com.cg;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHover { 
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get(" https://www.shoppersstop.com/");
System.out.println("demo webpage Displayed");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
Actions actions = new Actions(driver);
WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'KIDS')]"));
actions.moveToElement(menuOption).perform();
System.out.println("Done Mouse hover on 'Kids' from Menu");
WebElement subMenuOption1 = driver.findElement(By.xpath("//a[contains(text(),'WATCHES')]"));
actions.moveToElement(subMenuOption1).perform();
System.out.println("Done Mouse hover on 'watch' from Menu");
subMenuOption1.click();
List<WebElement> watches_list=driver.findElements(By.tagName("WATCHES"));
System.out.println("total no of watch"+watches_list.size());
driver.close(); 
	}
	}



