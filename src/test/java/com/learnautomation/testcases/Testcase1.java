package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	
	
	@Test
	@Parameters("url2")
	public void test1(String url) {
		
		System.out.println("Testcase1");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		

		driver.get(url);
		String actualvalue=driver.getTitle();
		System.out.println(actualvalue);
		Assert.assertEquals(actualvalue, actualvalue);
		
		driver.close();
		//git checking
		//final checking
	}
	
	@Test
	public void test2() {
		
		System.out.println("Testcase2");
	}
	
	@Test
	public void test3() {
		
		System.out.println("Testcase3");
	}
//test
}
