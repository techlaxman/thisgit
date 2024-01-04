package runclasstests;

import org.testng.annotations.Test;
public class jenkinstest {
  
	@Test
	public void addTest() {
	 int a=10, b=20;
	 int result=a+b;
	 System.out.println(" Result add is : "+result);
	}
	
	@Test
	public void subTest() {
		 int a=10, b=20;
		 int result=a-b;
		 System.out.println(" Result minus is : "+result);
	}
	@Test
	public void mulTest() {
		 int a=10, b=20;
		 int result=a*b;
		 System.out.println(" Result mul is : "+result);
	}
}
