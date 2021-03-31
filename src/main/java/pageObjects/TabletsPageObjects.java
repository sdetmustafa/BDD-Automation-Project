package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TabletsPageObjects extends Base {
	
	public TabletsPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//*[@id=\"menu\"]//*[contains(text(), 'Tablets')]")
//	private WebElement TabletsBtn;
//	
//	@FindBy(xpath = "//*[@id = 'input-sort']")
//	private WebElement sortByDropDownBtn;
//	
//	@FindBy(xpath = "//*[@id = 'input-limit']")
//	private WebElement showBTN;
//	
//	@FindBy(xpath = "//*[@title = 'Samsung Galaxy Tab 10.1']")
//	private WebElement samsunGalaxtTabBtn;

}
