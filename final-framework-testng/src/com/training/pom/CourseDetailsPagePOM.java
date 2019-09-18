package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseDetailsPagePOM {private WebDriver driver; 
	
	public CourseDetailsPagePOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Tests")
	private WebElement Testlink;
	
	

	 public void clickTestlink()
	 {
		 this.Testlink.click();
	 }
	 
}

