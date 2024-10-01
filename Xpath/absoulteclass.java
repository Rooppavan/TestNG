package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class absoulteclass{
  
  @Test
	  
	  public void openbrowser() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();

	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input[1]")).sendKeys("selenium");
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input[1]")).sendKeys("selenium");
      driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td[1]/input[1]")).click();
      
     
  }
}
