package com.qait.automation.simplemavendemowithcmd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demotest {

	@Test
	public void printname() {
		
		System.out.println("i am from deomotest class ");
		Assert.assertTrue(8==8,"test fails in deomtesst");
	}
}
