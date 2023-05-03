package demo1;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_5_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String s1 = driver.getTitle();
		String w1 = driver.getWindowHandle();
		System.out.println(s1);
		System.out.println(w1);

		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String s2 = driver.getTitle();
		String w2 = driver.getWindowHandle();
		System.out.println(s2);
		System.out.println(w2);

		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Cucumber");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		String s3 = driver.getTitle();
		String w3 = driver.getWindowHandle();
		System.out.println(s3);
		System.out.println(w3);

	}

}
