package Day1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "D:\\Narendra\\Practice\\SeleniumPractice\\Browsers\\chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.newtours.demoaut.com/");
	
	
	List<WebElement> links=driver.findElements(By.tagName("a"));
	for(int i=0;i<links.size();i++)
	{
	 
		WebElement el=links.get(i);
		String url=el.getAttribute("href");
		
		try {
			URL url1=new URL(url);
			
			HttpURLConnection connection=(HttpURLConnection)url1.openConnection();
			connection.setConnectTimeout(3000);
			connection.connect();
			if(connection.getResponseCode()==200)
			{
				System.out.println(url1+connection.getResponseMessage());
				
			}
			else if (connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(url1+connection.getResponseMessage());
			}
			
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
}
