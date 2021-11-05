package com.subrutin.selenium.nostra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.subrutin.selenium.SpringBaseTestNGTest;
import com.subrutin.selenium.page.nostra.HomePage;


@SpringBootTest
public class HomePageTest extends SpringBaseTestNGTest{

	@Autowired
	private HomePage homepage;
	
	@Test
	public void clickTest() {
		homepage.goTo();
		Assert.assertTrue(homepage.isAt());
		homepage.clickMenu();
		
	}
	
	
}
