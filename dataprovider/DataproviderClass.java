package dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataproviderClass {
  @Test(dataProvider = "biscuit")
  public void lemon(String n, String s) {
	  System.out.println(n);
	  System.out.println(s);
	  
  }

  @DataProvider (name = "biscuit")
  public String[][] dp() {
	  String[][] k = new String[2][2];
	  k[0][1] = "zeroone";
	  k[0][0] = "zerozero";
	  k[1][0] = "onezero";
	  k[1][1] = "oneone";	  
    return k;

  }
}
