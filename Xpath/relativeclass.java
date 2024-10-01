package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class relativeclass{
  
  @Test
	  
	  public void openbrowser() {
		  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();

	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
      driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("selenium");
      driver.findElement(By.xpath("//input[@tabindex='2']")).sendKeys("selenium");
      driver.findElement(By.xpath("//input[@name='clear']")).click();
      
     
  }
}
