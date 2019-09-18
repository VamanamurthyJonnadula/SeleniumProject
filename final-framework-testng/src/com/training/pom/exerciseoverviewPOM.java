package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class exerciseoverviewPOM {private WebDriver driver; 
	
	public exerciseoverviewPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//a[@class='btn btn-success btn-large']")
	private WebElement exerciseoverview;
	
	@FindBy(xpath= "//a[text()='Start test']")
	private WebElement starttestlink;
	
	@FindBy(xpath = "//input[@id='choice-85-1']")
	private WebElement overviewanswer;

	@FindBy(xpath = "//button[@name='save_now']")
	private WebElement endbtn;
	
	@FindBy(xpath = "//div[contains(text(),'Saved.')]")
	private WebElement SavedPage; 		
	
	 public void clickexerciseoverview()
	 {
		 this.exerciseoverview.click();
	 }
	
	public void overviewanswer()
	{
		this.overviewanswer.click();
	}
    public void endbtn()
    {
    	this.endbtn.click();
    }
    
    public boolean getSavedPage() {
		
		return this.SavedPage.isDisplayed();
		
    }
}


