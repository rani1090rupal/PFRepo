package com.cg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Alert;

public class DoubleClick {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	 driver= new ChromeDriver();

//Launch the Application Under Test (AUT)
driver.get("http://demo.guru99.com/test/simple_context_menu.html");
driver.manage().window().maximize();

//right click
Actions action=new Actions(driver);
WebElement link=driver.findElement(By.cssSelector(".context-menu-one"));
action.contextClick(link).perform();


//Double click the button to launch an alertbox
Actions action1 = new Actions(driver);
WebElement link1 =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
action1.doubleClick(link1).perform();



//Switch to the alert box and click on OK button
Alert alert = driver.switchTo().alert();
System.out.println("Alert Text\n" +alert.getText());
alert.accept();
//Closing the driver instance
//driver.quit();

}
}