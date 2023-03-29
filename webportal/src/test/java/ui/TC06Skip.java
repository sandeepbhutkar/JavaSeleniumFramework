package ui;

import org.testng.annotations.Test;

    public class TC06Skip {
	
	@Test(enabled=false)
	public void Test1()
	{
		System.out.print("Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.print("Test2");
	}

}
