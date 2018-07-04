package com.qait.automation.simplemavendemowithcmd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
	public void sum()
	{
		int a=10,b=25;
		int sum=a+b;
		System.out.println("sum");
		Assert.assertTrue(a+b==sum,"sum functionality fails");
		
	}
    @Test
  	public void sub()
  	{
  		int a=10,b=25;
  		int sub=a-b;
  		System.out.println("sub");
  		Assert.assertTrue(a-b==sub,"sub functionality fails");
  		
  	}
    @Test
  	public void mul()
  	{
  		int a=10,b=25;
  		int sum=a*b;
  		System.out.println("mul");
  		Assert.assertTrue(a*b==sum,"sum functionality fails");
  		
  	}
    @Test
  	public void div()
  	{
  		int a=10,b=50;
  		int sum=b/a;
  		System.out.println("div");
  		Assert.assertTrue(b/a==sum,"sum functionality fails");
  		
  	}
    
    
}
