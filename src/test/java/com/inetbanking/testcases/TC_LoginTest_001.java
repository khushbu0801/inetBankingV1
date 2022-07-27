package com.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws Exception{
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setuserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clicksubmit();
		
		logger.info("Login Check");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}

}
