package Day1;

import org.testng.annotations.Test;

public class InvocationTimeout {

	
	   @Test(invocationTimeOut=1000)
	   public void test()
	   {
	      System.out.println("The Value Of I");   
	   }
}
