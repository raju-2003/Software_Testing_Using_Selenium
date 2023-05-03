package demo1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class day_7_3 {
  WebDriver driver;
  @Test
  public void f() throws Exception {
	  Thread.sleep(5000);
	  WebElement a = driver.findElement(By.name("username"));
	  a.sendKeys("Admin");
	  
	  WebElement b = driver.findElement(By.name("password"));
	  b.sendKeys("admin123");
	  
	  WebElement c = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  c.submit();
	  
	  Thread.sleep(3000);
	  String u1=driver.getCurrentUrl();
	  System.out.println(u1);
	  String u2="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	  Assert.assertEquals(u1, u2);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co); // Initialize driver
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	    driver.quit();
  }

}
