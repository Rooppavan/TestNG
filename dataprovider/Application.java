package dataprovider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Application {
	WebDriver  driver;
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	     driver.findElement(By.name("txtUserName")).sendKeys(n);
	     driver.findElement(By.name("txtPassword")).sendKeys(s);
	     driver.findElement(By.name("Submit")).click();
  }

  @DataProvider
  public String[][] dp() {
	 String [][] l = new String [1][2];
	 l[0][0]= "selenium";
	 l[0][1]= "selenium";
    return l;
  }
}
