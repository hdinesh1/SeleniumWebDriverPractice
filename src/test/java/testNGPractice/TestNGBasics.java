package testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@Test (priority = 1)
	public void test1() {
		System.out.println("TestNG is working");
	}
	
	@Test (priority = 2)
	public void addTest() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("c= " + c);
		Assert.assertEquals(c, 30);
	}

	@Test 
	public void subtractTest() {
		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println("c= " + c);
		Assert.assertEquals(c, 10);
	}
	
	@Test (priority = 4)
	public void multTest() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("c= " + c);
		Assert.assertEquals(c, 200);
	}
}
