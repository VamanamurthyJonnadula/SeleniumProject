package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursecatalogPOM {private WebDriver driver; 
	
	public CoursecatalogPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[contains(text(),'Course catalog')]")
	private WebElement Coursecataloglink;
	
	
	
	
	public void ClickCoursecatalog()
	{
      this.Coursecataloglink.click();
	}

}






