package Testngpack;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class fruit {
	
	
  @Test (priority=3)
  public void ma() {
	  String fruit = "mango";
	  assertEquals(fruit, "mango");
	  System.out.println("The fruit is mangoo");	  
  }
  
  @Test (priority=2)
  public void co() {
	  String fruit = "coconut";
	  System.out.println("The fruit is coconut");  
  }
  @Test (priority=4)
  public void ban() {
	  String fruit = "banana";
	  System.out.println("The fruit is banana");  
}
  @Test (priority=4)
  public void jack() {
	  String fruit = "jackfruit";
	  assertEquals(fruit, "jackfruit");
	  System.out.println("The fruit is jackfruit"); 
}
  @Test (priority=1)
  public void gra() {
	  String fruit = "grapes";
	  assertEquals(fruit, "grapes");
	  System.out.println("The fruit is grapes"); 
}
  
}
