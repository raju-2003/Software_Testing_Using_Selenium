package demo1;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class day_9_4 {
	WebDriver driver;
	  @Test
	  public void f() throws Exception {
		  Thread.sleep(3000);
		  WebElement uname=driver.findElement(By.name("username"));
		  WebElement pwd=driver.findElement(By.name("password"));
		  WebElement submit=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		  uname.sendKeys("Admin");
		  pwd.sendKeys("admin123");
		  submit.click(); 
		  Thread.sleep(3000);
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	  }
	  
	  @Parameters("browser")
	  @BeforeMethod
	  public void beforeMethod(String b1) 
	  {
		  if(b1.equals("chrome"))
		  {
		  WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
			driver.get(url);
			driver.manage().window().maximize();
	  }
		  else if(b1.equals("edge"))
		  {		WebDriverManager.edgedriver().setup();
			  	driver=new EdgeDriver();
				driver.manage().window().maximize();
				String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
				driver.get(url);
				driver.manage().window().maximize();  
		  }
	}
	  
	  @AfterMethod
	  public void afterMethod()
	  {
		  driver.quit();
	  }

}
