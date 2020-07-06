package Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DropDownSorting {

	@Test
	public void validateSortingOrder()
	{
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Narendra\\Practice\\SeleniumPractice\\Browsers\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/mercuryregister.php?osCsid=199f9d22761bc0c83b3d9d43c5f44c87");
		
	  List actuallist=new ArrayList();
	  
	 WebElement countryDropdown=driver.findElement(By.name("country"));
	 
	List<WebElement>options=countryDropdown.findElements(By.tagName("option"));
	  /*for(int i=0;i<options.size();i++)
	  {
		 System.out.println( options.get(i).getText());
	  }*/
	
	
	for(WebElement i:options)
	{
		String data= i.getText();
		actuallist.add(data);
		
	}
	
	  List expectedlist=new ArrayList();
	  
	  expectedlist.addAll(actuallist);
	  
	 Collections.sort(expectedlist,Collections.reverseOrder());
	  
	 System.out.println(actuallist);
	 System.out.println(expectedlist); 
	 
	 
	 if(actuallist.equals(expectedlist))
	 {
		 System.out.println("both dropdown lists are same  -----> Test case pass");
		 
	 }
	 else 
	 {
		 System.out.println("both dropdown lists are not same -----> Test case faile");
		 
		 
	 }
	 
	
	
	}

}
