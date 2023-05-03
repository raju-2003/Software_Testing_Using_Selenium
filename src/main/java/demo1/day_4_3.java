package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_4_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(10000);
		
		 WebElement fn = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
	     fn.sendKeys("B");
	     
         WebElement f = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
         f.sendKeys("Raj");
         
         WebElement a = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
         a.sendKeys("21cse128@skcet.ac.in");
         
         WebElement b = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
         b.sendKeys("1234");
         
         WebElement c = driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]"));
         c.click();
	}

}
