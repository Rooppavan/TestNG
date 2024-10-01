package Screenshotpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Class1 {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	     
	    s("Homepage");
	     driver.findElement(By.name("txtUserName")).sendKeys("selenium");
	  
	     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
	     s("Afterlogin");
	     driver.findElement(By.name("Submit")).click();
	     s("login");
  }
  public void s (String p) throws IOException {
	  File S3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File T3= new File("C:\\Users\\PAVAN\\Desktop\\Screenshot\\"+ p +".jpg");
	     FileHandler.copy(S3, T3);
	  
  }
}
