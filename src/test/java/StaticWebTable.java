
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class StaticWebTable {
    public static void main(String args[]) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
            
        // Maximize the browser
        driver.manage().window().maximize();
    
        // Launch Website
        driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
        List<WebElement> costColumns= driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
          
          int sum_price=0;
          
          for(WebElement e : costColumns)
        {
           sum_price= sum_price+Integer.parseInt(e.getText());
        }
        
        System.out.println("total price: "+sum_price);
          
    }
  
}