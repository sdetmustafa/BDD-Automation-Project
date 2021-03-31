package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageWebElement extends Base {
	
//	public RetailPageWebElement() {
//		PageFactory.initElements(driver,this);
//	}
//	
//	@FindBy(xpath ="(//*[@class='hidden-xs hidden-sm hidden-md'])[3]")
//	private WebElement myAccountButton;
//	public void userClickOnMyAccount() {
//		WebDriverUtility.clickOnElement(myAccountButton);
//	}
//	
//	
//	@FindBy(xpath = "//*[contains(text(), 'Login')]")
//	private WebElement loginButton;
//	
//	@FindBy(id = "//*[@id = 'input-email']")
//	private WebElement emailField;
//	
//	@FindBy(id = "//*[@id = 'input-password']")
//	private WebElement passwordField;
//	
//	@FindBy(xpath = "//*[@value = 'Login']")
//	private WebElement loginButtonToAccount;
//	
//	@FindBy(id = "//*[@id = 'common-success']")
//	private WebElement accountDashBoard;
//	
//	@FindBy(xpath = "//*[contains(text(), 'Register for an affiliate account')]")
//	private WebElement registerForAnAffiliateAccount;
//	
//	@FindBy(id = "//*[@id = 'input-company']")
//	private WebElement inputCompanyField;
//	
//	@FindBy(id = "//*[@id = 'input-website']")
//	private WebElement inputWebsiteField;
//	
//	@FindBy(id = "//*[@id = 'input-tax']")
//	private WebElement inputTaxField;
//	
//	@FindBy(xpath = "(//*[@type = 'radio'])[2]")
//	private WebElement paymentMethodField;
//	
//	@FindBy(id = "//*[@id = 'input-paypal']")
//	private WebElement paypalInputField;
//	
//	@FindBy(xpath = "//*[@type = 'checkbox']")
//	private WebElement checkBox;
//	
//	@FindBy(xpath = "//*[@value = 'Continue']")
//	private WebElement continueButton;
//	
//	@FindBy(xpath = "//*[@class = 'alert alert-success alert-dismissible']")
//	private WebElement successMessageOfAffiliatedForm;
//	
//	@FindBy(xpath = "//*[contains(text(), 'Edit your affiliate information')]")
//	private WebElement editYourAffiliateLink;
//	
//	@FindBy(xpath = "(//*[@type = 'radio'])[3]")
//	private WebElement bankTransferRadioButton;
//	
//	@FindBy(id = "//*[@id = 'input-bank-name']")
//	private WebElement bankNameField;
//	
//	@FindBy(id = "//*[@id = 'input-bank-branch-number']")
//	private WebElement abaField;
//	
//	@FindBy(id = "//*[@id = 'input-bank-swift-code']")
//	private WebElement swiftCodeField;
//	
//	@FindBy(id = "//*[@id = 'input-bank-account-name']")
//	private WebElement accountNameField;
//	
//	@FindBy(id = "//*[@id = 'input-bank-account-number']")
//	private WebElement accountNumberField;
//	
//	@FindBy(xpath = "//*[@value = 'Continue']")
//	private WebElement continueButtonChequePayment;
//	
//	@FindBy(xpath = "//*[@class = 'alert alert-success alert-dismissible']")
//	private WebElement successMessageOfChequePayment;
//	
//	@FindBy(xpath = "//*[contains(text(), 'Edit your account information')]")
//	private WebElement editYourAccountLink;
//	
//	@FindBy(id = "//*[@id = 'input-firstname']")
//	private WebElement inputFirstNameField;
//	
//	@FindBy(id = "//*[@id = 'input-lastname']")
//	private WebElement inputLastNameField;
//	
//	@FindBy(id = "//*[@id = 'input-email']")
//	private WebElement inputEmailField;
//	
//	@FindBy(id = "//*[@id = 'input-telephone']")
//	private WebElement inputTelephoneField;
//	
//	@FindBy(xpath = "//*[@value = 'Continue']")
//	private WebElement continueButtonOfEditLink;
//	
//	@FindBy(xpath = "//*[@class = 'alert alert-success alert-dismissible']")
//	private WebElement editLinkSuccessMessage;
//	
//	
//	
//	public void userClickOnLogin() {
//		WebDriverUtility.clickOnElement(loginButton);
//	}
//	
//	public void enterUserName(String email) {
//		WebDriverUtility.enterValue(emailField, email);
//	}
//	
//	public void enterPassword(String password) {
//		WebDriverUtility.enterValue(passwordField, password);
//	}
//	
//	public void userClickOnLoginButton() {
//		WebDriverUtility.clickOnElement(loginButtonToAccount);
//	}
//	
//	public boolean isDashBoardDisplayed() {
//		if(accountDashBoard.isDisplayed())
//			return true;
//		else 
//			return false;
//	}
//	
//	public void clickOnAffiliateLink() {
//		WebDriverUtility.clickOnElement(registerForAnAffiliateAccount);
//	}
//	
//	public void userFillCompanyField(String companyName) {
//		WebDriverUtility.enterValue(inputCompanyField, companyName);
//	}
//	public void userFillWebsiteField(String websiteName) {
//		WebDriverUtility.enterValue(inputWebsiteField, websiteName);
//	}
//	
//	public void userFillTaxIdField(String taxID) {
//		WebDriverUtility.enterValue(inputTaxField, taxID);
//	}
//	
//	public void userFillpaymentField(String payment) {
//		WebDriverUtility.enterValue(paymentMethodField, payment);
//	}
//	
//	public void userCheckOnCheckBox() {
//		WebDriverUtility.clickOnElement(checkBox);
//	}
//	
//	public void clickOnContinueButtuon() {
//		WebDriverUtility.clickOnElement(continueButton);
//	}
//	
//	public boolean successMessageDisplayed() {
//		if(successMessageOfAffiliatedForm.isDisplayed())
//			return true;
//		else
//			return false;
//	}
//	
//	public void userEditAffiliateInformationLink() {
//		WebDriverUtility.clickOnElement(editYourAffiliateLink);
//	}
//	
//	public void userClickOnBankTransferRadioButton() {
//		WebDriverUtility.clickOnElement(bankTransferRadioButton);
//	}
//	
//	public void userFillBankNameField(String bankName) {
//		WebDriverUtility.enterValue(bankNameField, bankName);
//	}
//	
//	public void userFillabaNumberField(String abaNum) {
//		WebDriverUtility.enterValue(abaField, abaNum);
//	}
//	
//	public void userFillSwiftCodeField(String swiftCode) {
//		WebDriverUtility.enterValue(swiftCodeField, swiftCode);
//	}
//	
//	public void userFillAccountNameField(String accountName) {
//		WebDriverUtility.enterValue(accountNameField, accountName);
//	}
//	
//	public void userFillAccountNumberField(String accountNumber) {
//		WebDriverUtility.enterValue(accountNumberField, accountNumber);
//	}
//	
//	public void userClickOnContinueButton() {
//		WebDriverUtility.clickOnElement(continueButtonChequePayment);
//	}
//	
//	public boolean userSeeSuccessMessage() {
//		if(successMessageOfChequePayment.isDisplayed())
//			return true;
//		else
//			return false;
//	}
//	
//	public void clickOnEditAccountInformation() {
//		WebDriverUtility.clickOnElement(editYourAccountLink);
//	}
//	
//	public void userEnterFirstNameField(String firstName) {
//		WebDriverUtility.enterValue(inputFirstNameField, firstName);
//	}
//	
//	public void userEnterLastNameField(String lastName) {
//		WebDriverUtility.enterValue(inputLastNameField, lastName);
//	}
//	
//	public void userEnterEmailField(String email) {
//		WebDriverUtility.enterValue(inputEmailField, email);
//	}
//	
//	public void userEnterTelephoneNumber(String phoneNumber) {
//		WebDriverUtility.enterValue(inputTelephoneField, phoneNumber);
//	}
//	
//	public void userClickOnContinueButtonOfEditLink() {
//		WebDriverUtility.clickOnElement(continueButtonOfEditLink);
//	}
//	
//	public boolean editAccountLinkSuccessMessage() {
//		if(editLinkSuccessMessage.isDisplayed())
//			return true;
//		else
//			return false;
//	}
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
