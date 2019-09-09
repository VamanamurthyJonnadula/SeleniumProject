package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPOM {
	private WebDriver driver; 

	public AdminLoginPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Administration')]")
	private WebElement AdminLogin;
	
	
	
	public void AdminLoginBtn()
	{
	     this.AdminLogin.click();
	}

}






