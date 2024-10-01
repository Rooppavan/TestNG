package applicationpack;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class applicationcheck {
	public static WebDriver driver;

 
  @AfterMethod
  public void closebrowser() {
	  driver.close(); 
  }
  
  @Test
  public void login() {
	 
	  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
      driver.findElement(By.name("txtUserName")).sendKeys("selenium");
      driver.findElement(By.name("txtPassword")).sendKeys("selenium");
      driver.findElement(By.name("Submit")).click();
      
     
  }

  @BeforeClass
  public void openbrowser() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver();
      driver.manage().window().maximize();  
  }

}
