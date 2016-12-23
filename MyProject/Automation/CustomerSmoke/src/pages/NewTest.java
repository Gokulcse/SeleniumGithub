package pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

public class NewTest {

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("sample");
  }

  @Test
  public void f() {
	  int i=0;
	  System.out.println("f" + 10/i);
	  
  }
  @Test
  public void g() {
	  System.out.println("g");
  }
  @Test
  public void h() {
	  System.out.println("h");
  }
  
  @Test
  public void i() {
	  System.out.println("i");
  }
  @BeforeMethod
  public void j() {
	  System.out.println("before each method");
  }
  
}
