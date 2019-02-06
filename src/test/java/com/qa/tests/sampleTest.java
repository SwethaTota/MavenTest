package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTest{

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
	int x= 100;
	int y = 10;
	Assert.assertEquals(1000, x*y);
	}
	
	@Test
	public void div(){
		System.out.println("DIV");
		int x = 100;
		int y = 10;
		Assert.assertEquals(10, x/y);
		
	}
	// to run in cmd----- cd C:\Users\tota\workspace\MavenTest
	//mvn clean install --> it will create the build(create jar files)-->generating build for automation
	//mvn test -->just to run tests without clean install-->it will not execute complete build
	
	//to skip test cases using mvn --
	//1. mvn package -Dskiptests//only Build is getting created and test won't be called
	//2.  mvn package -Dmaven.test.skip=true
	//<mvn.test.skip>true</mvn.test.skip> add this in pom.xml -->under properties---all the test cases will be ignored
	//but it is mandatory to execute tests 
	//to execute all tests from all classes , create src/main/resources package and copy testng.xml file in there. add plugins in pom.xml
}
