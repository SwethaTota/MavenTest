package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest1 {

	@Test
	public void sum(){
		System.out.println("SUM");
		int a = 10;
		int b= 20;
		Assert.assertEquals(30, a+b);
		
	}
	@Test
	public void sub(){
		System.out.println("SUB");
		int a = 20;
		int b = 10;
		Assert.assertEquals(10, a-b);
	}
	
	@Test
	public void mul(){
		System.out.println("MUL");
	int x= 10;
	int y = 10;
	Assert.assertEquals(100, x*y);
	}
	
	@Test
	public void div(){
		System.out.println("DIV");
		int x = 100;
		int y = 10;
		Assert.assertEquals(10, x/y);
		
	}
}