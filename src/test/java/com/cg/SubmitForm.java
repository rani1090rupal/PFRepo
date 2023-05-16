package com.cg;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SubmitForm {

	public static void main(String[] args) throws InterruptedException
	{
		//set system property
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		//to open chrome browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		//get() method can not track the history of browser
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		//navigate().to() method->can track the history of browser and can perform back and forth in the browser
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.navigate().refresh();

		Thread.sleep(5000);

		WebElement inputFirstname=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[1]/input"));
		inputFirstname.sendKeys("Rupal");
		Thread.sleep(2000);



		WebElement inputLastName=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[1]/div[2]/input"));
		inputLastName.sendKeys("Singh");
		Thread.sleep(2000);
		
		WebElement address=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[2]/div/textarea"));
		address.sendKeys("Hapur");
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[3]/div[1]/input"));
		email.sendKeys("r98singhh@gmail.com");
		Thread.sleep(2000);
		
		WebElement phone=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[4]/div/input"));
		phone.sendKeys("1234567889");
		Thread.sleep(2000);
		
		
		WebElement radio=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[5]/div/label[2]/input"));
		radio.click();
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.id("checkbox1"));
		element.click(); //to click on checkbox we used click method
		Thread.sleep(2000);

//		WebElement selectlang=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]"));
//		Select selectLangs =new Select(selectlang);
//    	selectlang.click();
//    	Thread.sleep(2000);
//
//    	
//	    selectLangs.selectByIndex(7);
//		//selectSkills.selectByValue("3-5");
//		Thread.sleep(2000);


		WebElement elementSkill=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
		Select selectSkills1 =new Select(elementSkill);
		elementSkill.click();
		Thread.sleep(2000);
		
		selectSkills1.selectByIndex(7);

		Thread.sleep(2000);
		
//		WebElement elementCountry=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span"));
//		Select selectCountry1 =new Select(elementCountry);
//		elementCountry.click();
//		Thread.sleep(2000);
//		
//		selectCountry1.selectByIndex(7);
//
//		Thread.sleep(2000);
			
		WebElement elementyear=driver.findElement(By.id("yearbox"));
		Select selectyears =new Select(elementyear);
		elementyear.click();
		Thread.sleep(2000);
		
		selectyears.selectByIndex(1);
		//selectyears.selectByValue("1916");
		Thread.sleep(2000);
		
		WebElement elemetMonth=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));
		Select selectMonths =new Select(elemetMonth);
		elemetMonth.click();
		Thread.sleep(2000);
		
		selectMonths.selectByIndex(1);
		//selectyears.selectByValue("1916");
		Thread.sleep(2000);
		
		WebElement elemetDay=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select"));
		Select selectDays =new Select(elemetDay);
		elemetDay.click();
		Thread.sleep(2000);
		
		selectDays.selectByIndex(5);
		//selectyears.selectByValue("1916");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitbtn")).submit();
		System.out.println("Submit done");
		
		//close the browser
		driver.quit();
	}
}