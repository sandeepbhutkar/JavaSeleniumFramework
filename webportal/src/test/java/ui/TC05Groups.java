package ui;

import org.testng.annotations.Test;

@Test(groups="ClassLevel")
public class TC05Groups {
	
	@Test(groups="Smoke")
	public void Test1()
	{
		System.out.print("Test1");
	}
	
	@Test(groups="Smoke")
	public void Test2()
	{
		System.out.print("Test2");
	}
	
	@Test(groups={"Smoke","Regression"})
	public void Test3()
	{
		System.out.print("Test3");
	}

}
