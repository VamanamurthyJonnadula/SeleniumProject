package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursescatalogSearchPOM {private WebDriver driver; 
	
	public CoursescatalogSearchPOM (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@name='search_term']")
	private WebElement CoursecatalogSearch;
	
	@FindBy(xpath= "//div[@class='input-group']//button[1]")
	private WebElement catalogSearchbtn;
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
	private WebElement mycourselink;
	
	@FindBy(xpath = "//div[@class='courses']//a[contains(text(),'Sample003')]")
	private WebElement Userportallink;
	
	@FindBy(xpath = "//a[@id='istooldesc_1126']")
	private WebElement Courselink;
	
	@FindBy(xpath = "//div[@class='col-sm-6']//a[3]//img[1]")
	private WebElement AddAssessments;
	
	@FindBy(xpath = "//input[@id='add_cat_form_name']")
	private WebElement Categoryname;
	
	@FindBy(xpath = "//input[@id='weight']")
	private WebElement weight;
	
	@FindBy(xpath = "//button[@id='add_cat_form_submit']")
	private WebElement AddCategory;
	
	@FindBy(xpath = "//div[@class='alert alert-warning']")
	private WebElement Totalweight;
	
	public void CoursecatalogSearch(String searchTerm)
	{
      this.CoursecatalogSearch.sendKeys(searchTerm);
	}

	public void clickcatalogSearchbtn()
	{
		this.catalogSearchbtn.click();
	}


	
	 public void mycourselink()
	 {
		 this.mycourselink.click();
	 }


	   public void Userportallink()
	   {
		   this.Userportallink.click();
	   }


	   public void Courselink()
	   {
		   this.Courselink.click();
	   }
	   public void AddAssessments()
	   {
		   this.AddAssessments.click();
	   }
	   public void Categoryname(String Catname)
	   {
		   this.Categoryname.sendKeys(Catname);
	   }
	   
	   public void weight(String weight)
	   {
		   this.weight.sendKeys(weight);
	   }
	   public String AddCategoryLabel()
	   {
		   return this.AddCategory.getText();
	   }
	   public void clickAddcategory() {
		   this.AddCategory.click();
	   }
	   
	   public boolean Totalweight()
	   {
		   return this.Totalweight.isDisplayed();
	   }
}

