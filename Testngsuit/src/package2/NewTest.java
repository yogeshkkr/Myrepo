package package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new HtmlUnitDriver();
	  driver.get("https://www.google.com");
	 
	  System.out.println("this is package2 test");
	  
	  System.out.println( driver.getTitle());
	  
	  System.out.println( "changeses1");
	  
	  
  }
}
