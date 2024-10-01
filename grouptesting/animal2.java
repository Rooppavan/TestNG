package grouptesting;

import org.testng.annotations.Test;

public class animal2 {
	
  @Test (groups = "system")
  public void monkey() {
	  System.out.println("system testing 2");
	  
  }
  @Test (groups = "regression")
  public void donkey() {
	  System.out.println("regression testing 2"); 
  }
  
@Test (groups = "regression")
public void elephant() {
	  System.out.println("regression testing 2");
	  
}
@Test (groups = "unit")
public void cheetah() {
	  System.out.println("unit testing 2");
	  
}

}

