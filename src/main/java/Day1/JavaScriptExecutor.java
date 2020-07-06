package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
	
	
	@Test
	public void enterText()
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Narendra\\Practice\\SeleniumPractice\\Browsers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@name='userName']"));
		
		 //enter data by using javascriptexecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.evaluate(//input[@name='userName'], document, null, 9, null).singleNodeValue.innerHTML="+ "narendra");
		 js.executeScript("arguments[0].value='narendra';", username);
		
		 //element click by using javascriptexecutor
		 WebElement element = driver.findElement(By.xpath("//input[@name='login']"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", element);
		 
		 
		/* JavascriptExecutor js = ((JavascriptExecutor) driver);
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(5000);*/
		 
		 driver.navigate().back();
		//This will scroll the page Horizontally till the element is found
		WebElement Element = driver.findElement(By.xpath("//div[@class='footer']"));
         js.executeScript("arguments[0].scrollIntoView();", Element);
	}

}
