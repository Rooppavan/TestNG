package priority;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class classes {
	
	
  @Test (priority=3)
  public void ma() {
	  String classes = "3rd";
	  System.out.println("The class is 3rd");	  
  }
  
  @Test (priority=2)
  public void co() {
	  String classes = "2nd";
	  System.out.println("The class is 2nd");  
  }
  @Test (priority=5)
  public void ban() {
	  String classes = "5th";
	  System.out.println("The class is 5th");  
}
  @Test (priority=4)
  public void jack() {
	  String classes = "4th";
	  System.out.println("The class is 4th"); 
}
  @Test (priority=1)
  public void gra() {
	  String classes = "1st";
	  System.out.println("The class is 1st"); 
}
  
}
