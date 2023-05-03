package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_4_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		String s = driver.getCurrentUrl();
		String s1 = "https://j2store.net/free/";
		if(s.equals(s1)) {
			System.out.println("Crt URL ");
		}else {
			System.out.println("Wrong URL");
		}
		
		driver.findElement(By.linkText("Clothing (5)")).click();
		
		String a = driver.getCurrentUrl();
		String b = "https://j2store.net/free/index.php/shop?filter_catid=11";
		
		if(a.equals(b)) {
			System.out.println("Crt URL ");
		}else {
			System.out.println("Wrong URL");
		}
		
	}

}
