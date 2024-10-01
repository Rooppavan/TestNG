package grouptesting;

import org.testng.annotations.Test;

public class animal {
	
  @Test (groups = "System")
  public void cat() {
	  System.out.println("System testing 1");
	  
  }
  @Test (groups = "regression")
  public void dog() {
	  System.out.println("regression testing 1");
  }
  
@Test (groups = "System")
public void tiger() {
	  System.out.println("System testing 1 ");
	  
}
@Test (groups = "regression")
public void lion() {
	  System.out.println("regression testing 1");
	  
}

}

