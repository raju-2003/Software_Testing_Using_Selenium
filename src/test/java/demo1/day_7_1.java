package demo1;

import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class day_7_1 {
  WebDriver driver; // Declare driver as a global variable
  
  @Test
  public void f() {
	  String a = "Guest Registration Form – User Registration";
	  String b = driver.getTitle();
	  Assert.assertEquals(a, b);
//	  if(a.equals(b)) {
//		  System.out.println("Equal");
//	  }else {
//		  System.out.println("Not Equal");
//	  }
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	    WebDriverManager.chromedriver().setup();
  		ChromeOptions co=new ChromeOptions();
  		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co); // Initialize driver
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}