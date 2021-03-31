package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopWebElement extends Base {
	
//	public DesktopWebElement() {
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	@FindBy(xpath = "//*[text() = 'Desktops']")
//	private WebElement DesktopsTab;
//	
//	public void clikckonDesktopsTab() {
//		WebDriverUtility.clickOnElement(DesktopsTab);
//	}
//	
//	@FindBy(xpath = "//*[text() = 'Show All Desktops']")
//	private WebElement showAllDesktops;
//	
//	public void clickOnShowAllDesktops() {
//		WebDriverUtility.clickOnElement(showAllDesktops);
//	}
	
//	@FindBy(id = "//*[@id = 'product-category']")
//	private WebElement mainBody;
	
//	public void isAllItemsArePresent() {
//		WebDriverUtility.clickOnElement(mainBody);
//		
//	}
//	
	@FindBy(xpath = "//*[@title = 'HP LP3065']")
	private WebElement CartOptionOnHPLP;
	
	public void clickOnHpLp() {
		WebDriverUtility.clickOnElement(CartOptionOnHPLP);
	}
	
	@FindBy(id = "//*[@id = 'input-quantity']")
	private WebElement hpLpQuantityField;
	
	public void selectHpLpQuantityField() {
		hpLpQuantityField.clear();
		hpLpQuantityField.sendKeys("1");
	
	}
	
	@FindBy(id = "//*[@id='button-cart']")
	private WebElement hpLpButtonCart;
	
	public void clickOnHpLpAddToCartButton() {
		WebDriverUtility.clickOnElement(hpLpButtonCart);
	}
	
	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement hpLpSuccessMessage;
	
	public boolean hpLpSuccessMsg() {
		if(hpLpSuccessMessage.isDisplayed())
			return true;
			else
				return false;
	}
	
	@FindBy(xpath = "(//*[@type = 'button'])[12]")
	private WebElement addToCartOptionOnCanonEOS5D;
	
	public void cartOptionOfCanon() {
		WebDriverUtility.clickOnElement(addToCartOptionOnCanonEOS5D);
	}
	
	
	@FindBy(xpath = "//*[@id = 'input-option226']")
	private WebElement CanonColorDropDown;
	
	public void selectColorFromDropDown() {
		WebDriverUtility.selectByValue(CanonColorDropDown, "15");
		
	}
	
	@FindBy(xpath = "//*[@id = 'input-quantity']")
	private WebElement quantityFieldOfCanonEOS5D;
	
	public void canonSelectQuantityField() {
		quantityFieldOfCanonEOS5D.clear();
		quantityFieldOfCanonEOS5D.sendKeys("1");
	}
	
	@FindBy(xpath = "//*[@id='button-cart']")
	private WebElement canonAddToCartButton;
	
	public void addToCartButton() {
		WebDriverUtility.clickOnElement(canonAddToCartButton);
	}
	
	@FindBy(xpath = "//*[@class = 'alert alert-success alert-dismissible']")
	private WebElement canonSuccessMessage;
	
	public boolean canonSuccessMsg() {
		if(canonSuccessMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	@FindBy(xpath = "//*[text() = 'Canon EOS 5D']")
	private WebElement CanonEOS5DButton;
	
	public void clickOnCanonEOS5D() {
		WebDriverUtility.clickOnElement(CanonEOS5DButton);
	}
	
	@FindBy(xpath = "(//*[@data-toggle = 'tab'])[2]")
	private WebElement reviewLink;
	
	public void clickOnReviewLink() {
		WebDriverUtility.clickOnElement(reviewLink);
	}
	
	@FindBy(xpath = "//*[@id = 'input-name']")
	private WebElement yourNameField;
	
	public void enterYourNameField(String firstName) {
		WebDriverUtility.enterValue(yourNameField, firstName);
	}
	
	@FindBy(xpath = "//*[@id = 'input-review']")
	private WebElement yourReviewField;
	
	public void enterYourReview(String review) {
		WebDriverUtility.enterValue(yourReviewField, review);
	}
	
	@FindBy(name = "(//*[@name= 'rating'])[5]")
	private WebElement radioButtons;
	
	public void clickOnRatingRadioButton() {
		WebDriverUtility.clickOnElement(radioButtons);
	}
	
	@FindBy(id = "//*[@id = 'button-review']")
	private WebElement conintueBtnOfRadios;
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(conintueBtnOfRadios);
	}
	
	@FindBy(xpath = "//*[@class = 'alert alert-success alert-dismissible']")
	private WebElement reviewThanksMessage;
	
	public boolean canonSuccessMessage() {
		if(reviewThanksMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	

}
