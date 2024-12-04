package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	
	@Before(order=0)
	public void launchBrowser1()
	{
		System.out.print("Launching of Browser1");
	}
	@Before(order=1)
	public void launchBrowser2()
	{
		System.out.print("Launching of Browser2");
	}
	
	@Before(order=2)
	public void launchBrowser3()
	{
		System.out.print("Launching of Browser3");
	}
	
	
    @After(order=2)
	public void closeBrowser()
	{
		System.out.println("closed browser3");
	}
    
    @After(order=0)
	public void closeBrowser1()
	{
		System.out.println("closed browser1");
	}
    
    
    @After(order=1)
	public void closeWindow()
	{
		System.out.println("closed Window");
	}

}
