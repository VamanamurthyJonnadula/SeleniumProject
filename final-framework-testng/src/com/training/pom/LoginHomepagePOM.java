package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHomepagePOM{
	private WebDriver driver; 

	public LoginHomepagePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Homepage')]")
	private WebElement AdminLogin;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//img[@class='img-circle']")
	private WebElement AdminLogin1;
	
	
	public void AdminLoginBtn()
	{
	     this.AdminLogin.click();
	}

	public void AdminLoginBtn1()
	{
	     this.AdminLogin1.click();
	}
}



