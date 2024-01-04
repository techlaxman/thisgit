package crossbrowsertesting;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.driverBase;

public class CrossBrowser extends driverBase{

	
	public CrossBrowser()
	{
		super();
	}
	@BeforeMethod
	public void initBrowser() {
		browserStart();
	}
	@Test
	public void test() {
		System.out.println("inside testing..");
	}
	
}
