package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class startswithclass {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
     driver.findElement(By.xpath("//input[starts-with(@name,'txtU')]")).sendKeys("selenium");
     driver.findElement(By.xpath("//input[starts-with(@name,'txtP')]")).sendKeys("selenium");
     driver.findElement(By.xpath("//input[starts-with(@name,'Su')]")).click();
     
     
 }
  }

