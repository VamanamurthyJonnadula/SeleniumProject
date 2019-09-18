package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentsPOM {
	private WebDriver driver; 
	
	public AssignmentsPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	

			
			
	//Used linkText 
	
	@FindBy(linkText="Assignments")
	private WebElement Assignments;
	
	@FindBy(xpath = "//div[@class='actions']//a[1]//img[1]")
	private WebElement CreateAssign;
	
	@FindBy(xpath = "//input[@id='form1_new_dir']")
	private WebElement AssignName;
	
	@FindBy(xpath = "//button[@id='form1_submit']")
	private WebElement Submitbtn;
	
	@FindBy(xpath = "//div[@class='alert alert-success']")
	private WebElement DirectoryCreated;		
	
	 public void clickAssignmentslink()
	 {
		 this.Assignments.click();
				 
	 }
	
	 public void clickCreateAssignlink()
	 {
		 this.CreateAssign.click();
	 }
	 public void AssignName(String AssignName) 
	 {
		 this.AssignName.sendKeys(AssignName);
	 }
	 public void clickValidateSubmitbtn()
	 {
		 this.Submitbtn.click();
		 
	 }
	 
	public boolean getDirectoryCreated() {
		
		//String eleText=	this.DirectoryCreated.getText();
		System.out.println(this.DirectoryCreated.getText());
		return this.DirectoryCreated.isDisplayed();
		//return eleText;
	}
}

