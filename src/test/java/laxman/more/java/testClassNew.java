package laxman.more.java;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testClassNew {

	@Parameters({"browser","username","password"})
	@Test
	public void Test(String browser, String username, String password) {
		
		System.out.println("Browser: "+browser);
		System.out.println("Username: "+username);
		System.out.println("Password: "+password);
	}
	@Test
	public void testing() {
		
		System.out.println("Invoked methods..");
		System.out.println("Invoked methods..");
		System.out.println("Invoked methods..");
		System.out.println("Invoked methods..");
		System.out.println("Invoked methods..");
		System.out.println("Invoked methods..");

	}
}
