package waitpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class implicityclass {
	WebDriver driver;
  @Test
  public void f() {
	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     driver.findElement(By.name("Submit")).click();
  }
}
