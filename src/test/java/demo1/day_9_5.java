package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_9_5 {
	WebDriver driver;
	@Test
  public void f() throws Exception {
    	  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		  driver.get(url);
		  Thread.sleep(3000);
		  WebElement uname=driver.findElement(By.name("username"));
		  WebElement pwd=driver.findElement(By.name("password"));
		  WebElement submit=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		  uname.sendKeys("Suvitha");
		  pwd.sendKeys("12345");
		  submit.click();
		  String url1="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
  }
  @BeforeMethod
  public void beforeMethod() {
	  	WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
}
