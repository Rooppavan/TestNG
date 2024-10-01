package grouptesting;

import org.testng.annotations.Test;

public class animal3 {
	
  @Test (groups = "System")
  public void butterfly() {
	  System.out.println("system testing 3");
	  
  }
  @Test (groups = "regression")
  public void zebra() {
	  System.out.println("regression testing 3"); 
  }
  
@Test (groups = "unit")
public void panther() {
	  System.out.println("unit testing 3");
	  
}
@Test  (groups = "unit")
public void jaugar() {
	  System.out.println("unit testing 3");
	  
}

}

