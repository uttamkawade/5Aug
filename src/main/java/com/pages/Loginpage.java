package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage 
{
WebDriver lpdriver;
	
	public  Loginpage(WebDriver driver) {
		lpdriver=driver;
	}
	
	private WebElement getUserName() {
		return lpdriver.findElement(By.id("email"));
	}
	private WebElement getpassword() {
		return lpdriver.findElement(By.id("password"));
	}
	private WebElement getLoginButton() {
		return lpdriver.findElement(By.xpath("//button"));
		
	}
	private WebElement getregisterLink() {
		return lpdriver.findElement(By.partialLinkText("Register"));		
	}
	
	public void clickRegisterLink() {
		getregisterLink().click();
	}
	
	public void enterUsername(String text) {
		getUserName().sendKeys(text);
	}
	
	public void enterPassword(String text) {
		getpassword().sendKeys(text);
	}
	public void clickLoginButton() {
		getLoginButton().click();
	}

}
