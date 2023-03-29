package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//BeforeTest and AfterTest will run only once in class
//BeforeMethod and AfterMethod will run on every method in class.
/* BeforeTest,AfterTest
 * BeforeMethod,AfterMethod
 * BeforeClass,AfterClass
 * BeforeGroups,AfterGroups
 * BeforeSuite,AfterSuite*/

public class TC02BeforeAfter {
	
	@BeforeTest
	public void BeforeTest() 
	
	{
        System.out.print("BeforeTest");
	}
	
	@AfterTest
	public void AfterTest() 
	{
		System.out.print("AfterTest");
	}
	
	@BeforeMethod
	public void BeforeMethod() 
	
	{
        System.out.print("BeforeMethod");
	}
	
	@AfterMethod
	public void AfterMethod() 
	{
		System.out.print("AfterMethod");
	}
	
	@Test
	public void RunTestCase1()
	{
		System.out.print("RunTestCase1");
		
	}
	
	@Test
	public void RunTestCase2()
	{
		System.out.print("RunTestCase2");
		
	}

}
