package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ptclass {
 public static WebDriver driver;
  @Test
  public void googlemap() {
	  System.setProperty("webdriver.chrome.driver","D:\\MYFILES\\chromedriver-win64\\chromedriver-win64");
      driver = new ChromeDriver();
      driver.manage().window().maximize();  
      driver.get("https://www.google.com/maps/place/Computech+Info+Solutions+-+KPHB+-+Kukatpally/@17.4929973,78.3608502,13z/data=!4m10!1m2!2m1!1sbest+software+training+institute+in+kukatpally!3m6!1s0x3bcb917d4c30010f:0x82fadcd207f8d27f!8m2!3d17.4945652!4d78.4011036!15sCi5iZXN0IHNvZnR3YXJlIHRyYWluaW5nIGluc3RpdHV0ZSBpbiBrdWthdHBhbGx5IgOoAQFaMCIuYmVzdCBzb2Z0d2FyZSB0cmFpbmluZyBpbnN0aXR1dGUgaW4ga3VrYXRwYWxseZIBG3NvZnR3YXJlX3RyYWluaW5nX2luc3RpdHV0ZZoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VSNU9XRlVXbVZuRUFF4AEA!16s%2Fg%2F1tct755w?entry=ttu");
  }

@Test
public void google() {
	  System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();  
    driver.get("https://www.google.com/");
}
}
