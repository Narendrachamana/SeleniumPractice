package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {

WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Narendra\\Practice\\SeleniumPractice\\Browsers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		
		WebElement bigData = driver.findElement(By.xpath("//i[@class='fa fa-linux']//preceding ::i[@class='fa fa-briefcase']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", bigData);
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		bigData.click();
		
		
        
        
        
		
		
	}

}
