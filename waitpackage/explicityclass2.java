package waitpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicityclass2 {
	WebDriver driver;
  @Test
  public void f() {
	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
     
     driver.findElement(By.name("txtUserName")).sendKeys("selenium");
     driver.findElement(By.name("txtPassword")).sendKeys("selenium");
     WebElement j = new WebDriverWait(driver,Duration.ofSeconds(12)).until(ExpectedConditions.elementToBeClickable(By.name("Submi")));
     j.click();
  }
}
