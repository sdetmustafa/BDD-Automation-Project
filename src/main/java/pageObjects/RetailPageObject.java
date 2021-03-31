package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {
//	//we create constructor and inside the constructor we define the pagefactory.initelements
//	//method to initialize the webelement in this page.
//	public RetailPageObject() {
//		
//		PageFactory.initElements(driver, this);
//	}
//	
//	// we need to store webelements in a private webelememnt using @find annotaions of pagefactory
//	
//	@FindBy(xpath = "//*[@title= 'My Account']")
//	private WebElement myAccountBtn;
//	
//	@FindBy(xpath = "//input[@name = 'search']")
//	private WebElement searchBar;
//	
//	@FindBy(xpath = "//button[@class = 'btn btn-default btn-lg']")
//	private WebElement searchButton;
//	
//	@FindBy(xpath = "//img[@title='iPhone']")
//	private WebElement iphoneImage;	
//	
//	//webelement for register page
//	
//	@FindBy(xpath = "//a[text()='Register']")
//	private WebElement registerOption;
//	
//	@FindBy(xpath = "//*[@id = 'input-firstname']")
//	private WebElement firstNameField;
//	
//	@FindBy(xpath = "//*[@id = 'input-lastname']")
//	private WebElement lastNameField;
//	
//	@FindBy(xpath = "//*[@id = 'input-email']")
//	private WebElement emailField;
//	
//	@FindBy(xpath = "//*[@id = 'input-telephone']")
//	private WebElement telephoneField;
//	
//	@FindBy(xpath = "//*[@id = 'input-password']")
//	private WebElement passwordField;
//	
//	@FindBy(xpath = "//*[@id = 'input-confirm']")
//	private WebElement confirmPasswordField;
//	
//	@FindBy(xpath ="(//input[@value='1'])[1]")
//	private WebElement yesSubscribeButton;
//	
//	@FindBy(xpath ="(//input[@value='0'])[1]")
//	private WebElement noSubscribeButton;
//	
//	@FindBy(xpath = "//input[@type='checkbox']")
//	private WebElement privacyPolicyCheckBox;
//	
//	@FindBy(xpath ="//input[@value='Continue']")
//	private WebElement continueButton;
//	
//	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
//	private WebElement accountCreatedMessage;
//	
//	// we need to create public methods to perform required actions on each elements we stored
//	
//	public void EnterValueToSearchBar(String value) {
//		WebDriverUtility.enterValue(searchBar, value);
//			
//		}
//	public void clickOnSearchButton() {
//		WebDriverUtility.clickOnElement(searchButton);
//		
//	}
//	
//	public boolean iphoneImageIsDisplayed() {
//		if(iphoneImage.isDisplayed())
//			return true;
//		else
//			return false;
//	}
//	
//	// We need to creat methods to perform on each webelements
//	
//	public void clickOnMyAccount() {
//		WebDriverUtility.clickOnElement(myAccountBtn);
//	}
//	
//	public void clickOnRegister() {
//		WebDriverUtility.clickOnElement(registerOption);
//	}
//	
//	public void enterFirstName(String fName) {
//		WebDriverUtility.enterValue(firstNameField, fName);
//	}
//	
//	public void enterLastName(String lName) {
//		WebDriverUtility.enterValue(lastNameField, lName);
//	}
//	
//	public void enterEmail(String email) {
//		WebDriverUtility.enterValue(emailField, email);
//	}
//	
//	public void enterTelephone(String phoneNumber) {
//		WebDriverUtility.enterValue(telephoneField, phoneNumber);
//	}
//	public void enterPassword(String password) {
//		WebDriverUtility.enterValue(passwordField, password);
//	}
//	public void enterConfirmPassword(String confirmPassword) {
//		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
//	}
//	public void subscribe(String valueOfSubscribe) {
//		if (valueOfSubscribe.equalsIgnoreCase("yes")) {
//			if (!yesSubscribeButton.isSelected())
//				WebDriverUtility.clickOnElement(yesSubscribeButton);
//		} else
//			WebDriverUtility.clickOnElement(noSubscribeButton);
//	}
//	public void checkPrivacyPolicy() {
//		if (privacyPolicyCheckBox.isDisplayed()) {
//			privacyPolicyCheckBox.click();
//		}
//	}
//	public void clickOnContinueButton() {
//		WebDriverUtility.clickOnElement(continueButton);
//	}
//	public boolean registrationOutcome() {
//		boolean successMessage = accountCreatedMessage.isDisplayed();
//		return successMessage;
//	}
//	
	
	
	
	
	
	
	
	
	

}
	