package laxman.more.java;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
@Test()	
  public void f1() {
	  System.out.println("sanity Test f1");
  }
  @Test()
  public void f2() {
	  //Assert.assertEquals("aa", "22");
	  System.out.println("smoke Test f2");
  }
  @Test(dataProvider="dp")
  public void f3(String a1, String a2,String a3,String a4) {
	  System.out.println("a1:- "+a1);
	  System.out.println("a2:- "+a2);
	  System.out.println("a3:- "+a3);
	  System.out.println("a4:- "+a4);
	  
  }@Test
  public void f4() {
	  System.out.println("Test f4");
  }@Test
  public void f5() {
	  System.out.println("Test f5");
  }
  @DataProvider(name="dp")
  public Object[][] dataProvider() {
	  
	  Object[][] arr=new Object[2][4];
	  
	  arr[0][0]="0";
	  arr[0][1]="1";
	  arr[0][2]="2";
	  arr[0][3]="3";
	  arr[1][0]="4";
	  arr[1][1]="5";
	  arr[1][2]="6";
	  arr[1][3]="7";
	  return arr;
  }
}
