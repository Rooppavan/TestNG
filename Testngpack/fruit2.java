package Testngpack;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class fruit2 {
	
	
  @Test
  public void ma() {
	  String fruit = "mango";
	  assertEquals(fruit, "mango");
	  System.out.println("The fruit is mangoo");	  
  }
  
  @Test
  public void co() {
	  String fruit = "coconut";
	  assertEquals(fruit, "coconut");
	  System.out.println("The fruit is coconut");  
  }
  @Test
  public void ban() {
	  String fruit = "banana";
	  assertEquals(fruit, "banana");
	  System.out.println("The fruit is banana");  
}
  @Test
  public void jack() {
	  String fruit = "jackfruit";
	  assertEquals(fruit, "jackfruit");
	  System.out.println("The fruit is jackfruit"); 
}
  @Test
  public void gra() {
	  String fruit = "grapes";
	  assertEquals(fruit, "grapes");
	  System.out.println("The fruit is grapes"); 
}
  
}
