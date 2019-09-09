package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassesPOM {
	private WebDriver driver; 
	
	public ClassesPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Classes')]")
	private WebElement Classes;
		
	/*@FindBy(xpath="//div[@class='actions']//a[2]//img[1]")
	
	@FindBy(id="Name")
	private WebElement Name; 
	@FindBy("usergroup_name")
	
	@FindBy(id="Description")
	private WebElement Description; 
	@FindBy("usergroup_description")
	
	@FindBy(id="Group Permissions")
	private WebElement Group Permissions; 
	@FindBy("usergroup_visibility")
	
	@FindBy(id="Add")
	private WebElement Add; 
	@FindBy("usergroup_submit")*/
	
	
	
	
	public void ClickClasses()
	{
	     this.Classes.click();
	}

}






