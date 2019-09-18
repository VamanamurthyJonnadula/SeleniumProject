package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userportalPOM {private WebDriver driver; 
	
	public userportalPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement mycourselink;
	
	@FindBy(xpath="//a[contains(text(),'Selenium-Webdriver1')]")
	private WebElement courseNamelink;

	 public void clickcourseNamelink()
	 {
		 this.courseNamelink.click();
	 }
	 
}

