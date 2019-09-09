package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddclassesPOM {
	private WebDriver driver; 
	
	public AddclassesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
			
	@FindBy(xpath="//div[@class='actions']//a[2]//img[1]")
	private WebElement Addclasses;
	

	
	public void Addclasses()
	{
	     this.Addclasses.click();
	     
	}

}






