package com.cg;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertsPopUps {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// path to the driver executable must be set by the webdriver.chrome.driver
		// system property;
		System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");// Create a instance of the Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// to maximize the current window// Launch sampleSiteForSelenium
		driver.get("http://demo.automationtesting.in/Alerts.html");// Handling alert boxes
		// Click on generate alert button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/button")).click();Thread.sleep(3000);// Using Alert class to first switch to or focus to the alert box
		Alert alert = driver.switchTo().alert();// Using accept() method to accept the alert box, that is press OK button
		alert.accept();// Handling confirm box
		// Click on Generate Confirm Box
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		// click on the button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();Thread.sleep(3000);
		Alert confirmBox = driver.switchTo().alert();// Using dismiss() command to dismiss the confirm box, to press cancel button
		// Similarly accept can be used to accept the confirm box
		confirmBox.dismiss(); //to press Cancel button
		//confirmBox.accept(); // to press OK button
		Thread.sleep(3000);
		//Handling prompt box
		//Click on prompt Box
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(3000);//click on the button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[3]/button")).click();
		Thread.sleep(3000);Alert prompt = driver.switchTo().alert();String alertMessage = driver.switchTo().alert().getText(); //msg from prompt box
		System.out.println("Message from prompt box- "+alertMessage);prompt.sendKeys("Snehal");
		prompt.accept();
		//to get msg after prompt box
		Thread.sleep(3000);
		String msg=driver.findElement(By.id("demo1")).getText();System.out.println("Message after prompt box- "+msg);Thread.sleep(3000);// Close the browser
		driver.quit();
	}
	}


