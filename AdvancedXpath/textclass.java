package AdvancedXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class textclass {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      driver = new ChromeDriver();
     driver.manage().window().maximize(); 
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
     driver.findElement(By.xpath("//input[contains(@name,'ame')]")).sendKeys("selenium");
     driver.findElement(By.xpath("//input[contains(@name,'Pas')]")).sendKeys("selenium");
     driver.findElement(By.xpath("//input[contains(@name,'bmi')]")).click();
     
     
    String s = driver.findElement(By.xpath("//li[text()='Welcome selenium']")).getText();
     System.out.println(s);
     
     
     
     
     
     
 }
  }

