package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribeusersPOM {
	private WebDriver driver; 
	
	public SubscribeusersPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//tr[@id='13']//a[1]//img[1]")
			private WebElement SubscribeusersPOM;
	
	
	
	
	public void SubscribeusersPOM()
	{
	     this.SubscribeusersPOM.click();
	}

}






