package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,5000)");
		
		
		Thread.sleep(10000);
		
		WebElement a = driver.findElement(By.id("input-firstname"));
        a.sendKeys("Raj Narayanan");
        WebElement b = driver.findElement(By.id("input-lastname"));
        b.sendKeys("B");
        WebElement c = driver.findElement(By.id("input-email"));
        c.sendKeys("2003braj@gmail.com");
        WebElement d = driver.findElement(By.id("input-password"));
        d.sendKeys("!@#$");
        WebElement e = driver.findElement(By.id("input-newsletter-yes"));
        e.click();
		
        
       
	}

}
