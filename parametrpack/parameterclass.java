package parametrpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterclass {
	
  @Parameters({"bro","un","pw"})
  @Test
  public void openingbro(String bro,String un,String pw) {
	  
	  if(bro.equals("C")) 
	  {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver  driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	     driver.findElement(By.name("txtUserName")).sendKeys(un);
	     driver.findElement(By.name("txtPassword")).sendKeys(pw);
	     driver.findElement(By.name("Submit")).click();
  }
	
  if(bro.equals("E"))
  {
  System.setProperty("webdriver.edge.driver","D:\\MYFILES\\msedgedriver.exe");
  WebDriver driver = new EdgeDriver();
  driver.manage().window().maximize();
  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
  driver.findElement(By.name("txtUserName")).sendKeys(un);
  driver.findElement(By.name("txtPassword")).sendKeys(pw);
  driver.findElement(By.name("Submit")).click();
  }
  }
}
