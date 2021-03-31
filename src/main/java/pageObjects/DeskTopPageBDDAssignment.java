package pageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DeskTopPageBDDAssignment extends Base {
	
	public DeskTopPageBDDAssignment() {
		PageFactory.initElements(driver, this);
	}
	
	// method to initialize the WebElements in this page.
	@FindBy(xpath = "(//*[@class = 'dropdown-toggle'])[2]")
	private WebElement desktopsTab;
	
	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showalldesktops;
	
	@FindBy(xpath ="//div[@class='row']/div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']\r\n"+ "")
	private List<WebElement> itemsPresentInDesktop;
	

	@FindBy(xpath = "(//button[@type='button'])[15]")
	private WebElement clickAddToCartHPItime;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity1;

	@FindBy(xpath = "//*[@id='button-cart']")
	private WebElement clickAddToCartButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement  successMessageHP_LP;
	

	//WebElement for Canon EOS 5D from Desktops page
	@FindBy(xpath = "(//button[@type='button'])[12]")
	private WebElement clickAddToCartOptionOnCanonEOS5DItiem;
	
	//@FindBy(xpath = "//select[@class='form-control']")
	//private WebElement colorFromDropdownRed;
	
	@FindBy(id = "input-option226")//To be ask about color dropdown red
	private WebElement colorFromDropdown;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement selectQuantity_1;
	
	@FindBy(xpath = "//button[@id='button-cart']")
    private WebElement addToCartButton;
	
	@FindBy(xpath ="//*/div[@id='product-product']/div[1]")
	private WebElement SuccessMessageCanon;
	
	@FindBy(xpath = "//a[@href='#tab-review']")
	private WebElement clickOnWriteReviewLink;
	
	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement nameField;
	
	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourreviewField;
	
	@FindBy(xpath = "(//input[@name='rating'])[5]")
	private WebElement selectRatingBadOrGoood;
	
	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement clickOnContinueButton;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	private WebElement messageThanksApproval;

	
	// WebElemant for Register Page
	// we stored
	public void clickOnDesktop() {
		WebDriverUtility.clickOnElement(desktopsTab);
	}

	public void clickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(showalldesktops);
	}
	
	public boolean itemsArePresentInDesktopPageInDisplayed() {
		boolean isPresent = false;
		for(WebElement item :itemsPresentInDesktop) {
			if(item.isDisplayed()) {
				isPresent=true;
		
			} else {
				isPresent=false;
				break;
			}
		}
		return isPresent;

	}
	public void clickAddToCartHPItime() {
		WebDriverUtility.clickOnElement(clickAddToCartHPItime);
	}

	public void selectQuantity1() {
		WebDriverUtility.clickOnElement(selectQuantity1);
	}

	public void clickAddToCartButton() {
		WebDriverUtility.clickOnElement(clickAddToCartButton);
		}
	
	public boolean messageisDisplayed() {
		boolean successMessageyouHaveAddedHPLP3065ToYourShoppingCart = successMessageHP_LP.isDisplayed();
		return successMessageyouHaveAddedHPLP3065ToYourShoppingCart;
        }

	public void addToCartOptionOnCanonEOS5DItiem() {
		WebDriverUtility.clickOnElement(clickAddToCartOptionOnCanonEOS5DItiem);
	}
	
	public void colorFromDropdownRed() {
		WebDriverUtility.selectByValue(colorFromDropdown, "15");
		}
	
	public void selectQuantity_1() {
		WebDriverUtility.clickElementWithJS(selectQuantity_1);
	}
	
	public void addToCartButton() {
		WebDriverUtility.clickElementWithJS(addToCartButton);
        }
	
	public boolean messageISDisplayed() {
		boolean successMessageyouHaveAddedCanonEOS5DToYourShoppingCart = SuccessMessageCanon.isDisplayed();
		return successMessageyouHaveAddedCanonEOS5DToYourShoppingCart;
		}
	
	public void clickOnWriteReviewLink() {
		WebDriverUtility.clickElementWithJS(clickOnWriteReviewLink);
		}
	
	public void enterName(String Name) {
		WebDriverUtility.enterValue(nameField, Name);
	}
	
	public void enterReview(String reviewField) {
		WebDriverUtility.enterValue(yourreviewField, reviewField);
		}
	public void selectRating() {
		WebDriverUtility.clickOnElement(selectRatingBadOrGoood);
	}
	
	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(clickOnContinueButton);
		}
	
	public boolean ThanksMessageISDisplayed() {
		boolean messageThanksForYourReview = messageThanksApproval.isDisplayed();
		return messageThanksForYourReview;
		}
	
	}


