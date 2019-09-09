package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteiconPOM {private WebDriver driver; 
	
	public DeleteiconPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#\\31 3 > td:nth-child(6) > a:nth-child(5) > img")
	
			private WebElement DeleteiconPOM;
	
	
	
	
	public void DeleteiconPOM()
	{
	     this.DeleteiconPOM.click();
	}

}






