package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddclassesButtonPOM{
	private WebDriver driver; 
	
	public AddclassesButtonPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	
	
			
	@FindBy(id="usergroup_name")
	private WebElement AddclassesButton;
	
	@FindBy(id="usergroup_description")
	private WebElement AddclassesButton1;
	
	@FindBy(id="usergroup_submit")
	private WebElement AddPOM;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement ItemAddedtext;
	
	public void AddclassesButton(String Name)
	{
	     
	    	 this.AddclassesButton.sendKeys(Name);
	    	     

	}

	public void AddclassesButton1(String Description)
	{
	     
	    	 this.AddclassesButton1.sendKeys(Description);
	    	     

	}
	
	public void AddPOM()
	{
	     
	    	 this.AddPOM.click();
	}

	public boolean istextpresent() {
	     return this.ItemAddedtext.isDisplayed();

	}
}


