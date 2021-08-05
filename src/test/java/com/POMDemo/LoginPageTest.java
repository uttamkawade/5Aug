package com.POMDemo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.pages.DashboardPage;
import com.pages.Loginpage;

public class LoginPageTest {
	WebDriver driver;
	Loginpage lp=null;
	DashboardPage dp=null;
	@BeforeSuite
	public void setUp() {
		driver= TestBase.initialization();
		lp= new Loginpage(driver);
		dp= new DashboardPage(driver);
	}
   @AfterSuite
   public void closeloginpage(){
	   driver.close();
   }
	
	@Test(priority=1)
	public void loginTestCase() throws Exception {
		
		lp.enterUsername("kiran@gmail.com");
		lp.enterPassword("123456");
		lp.clickLoginButton();
		dp.clickLogout();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void registerTest() {
		lp.clickRegisterLink();
	}
}
