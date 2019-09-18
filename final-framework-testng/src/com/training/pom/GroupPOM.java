package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GroupPOM {
	private WebDriver driver; 
	
	public GroupPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@id='istooldesc_1121']")
	private WebElement Groups;
	
	@FindBy(xpath = "//div[@id='toolbar-groups']//a[1]//img[1]")
	private WebElement NewGroupImg;
	
	@FindBy(xpath = "//input[@id='create_groups_number_of_groups']")
	private WebElement NewGrpCreation;
	
	@FindBy(xpath = "//button[@id='create_groups_submit']")
	private WebElement ProceedToCreate;
	
	@FindBy(xpath = "//input[@name='group_0_name']")
	private WebElement GrpName;
	
	@FindBy(xpath = "//input[@id='places_0']")
	private WebElement Seats;
	
	@FindBy(xpath = "//button[@id='create_groups_step2_submit']")
	private WebElement CreateGrpBtn;
	 
	
	public void Groups()
	 {
		 this.Groups.click();
		 
	 }
	 public void NewGroupImg()
	 {
		 this.NewGroupImg.click();
	 }
	 public void NewGrpCreation()
	 {
		 this.NewGrpCreation.click();
	 }
	 public void ProceedToCreate()
	 {
		 this.ProceedToCreate.click();
	 }
	 public void GrpName()
	 {
		 this.GrpName.click();
	 }
	 public void Seats()
	 {
		 this.Seats.click();
	 }
	 public void CreateGrpBtn()
	 {
		 this.CreateGrpBtn.click();
	 }
} 

