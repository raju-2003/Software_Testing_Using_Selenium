package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.abhibus.com/bus-ticket-booking");
		WebElement src=driver.findElement(By.id("source"));
		src.sendKeys("Coimbatore");
		WebElement dst=driver.findElement(By.id("destination"));
		dst.sendKeys("Chennai");
		WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '04/10/2023')",datepick);
	}

}
