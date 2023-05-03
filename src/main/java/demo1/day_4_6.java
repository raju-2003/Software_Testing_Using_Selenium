package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day_4_6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// Driver setup
		WebDriverManager.chromedriver().setup();
    	ChromeOptions co=new ChromeOptions();
    	co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	//open an url
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,1000)","");
    	driver.findElement(By.linkText("Clothing (5)")).click();
    	List<WebElement> l1=driver.findElements(By.xpath("//h2[@class='product-title']"));
    	for(WebElement link:l1)
    	{
    		System.out.println(link.getText());
    	}
    	
	}

}
