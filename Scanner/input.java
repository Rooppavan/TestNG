package Scanner;

import java.util.Scanner;

import org.testng.annotations.Test;

public class input {
	
	
  @Test
  public void f() {
	  Scanner s = new Scanner(System.in);
	 int sonage = s.nextInt();
	  System.out.println("Enter the son age" );
	  
	   
	   System.out.println("the fatherage is :"+sonage);
  }
}
