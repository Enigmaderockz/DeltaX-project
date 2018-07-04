package com.deltaX.formApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationForm extends BasicOperations {

	public WebDriver driver;

	public registrationForm(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Initializing the WebElements by page factory model

	@FindBy(name = "first_name")
	private WebElement enterFirstName;

	@FindBy(name = "last_name")
	private WebElement enterLastName;

	@FindBy(name = "department")
	private WebElement selectDepartment;

	@FindBy(name = "user_name")
	private WebElement enterUsername;

	@FindBy(name = "user_password")
	private WebElement enterPassword;

	@FindBy(name = "confirm_password")
	private WebElement enterConfirmPassword;

	@FindBy(name = "email")
	private WebElement enterEmail;

	@FindBy(name = "contact_no")
	private WebElement enterContactNo;

	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//div[@class = 'class=\"col-md-4\"']")
	private WebElement submitButtonWithInvalidPhone;

	// Method to submit form with valid data

	public void submitForm(String firstname, String lastname, String username, String password, String confirmPassword,
			String email, String contactNo, String departmentValue) throws Exception {

		textboxControl.setText(enterFirstName, firstname);
		textboxControl.setText(enterLastName, lastname);
		selectDropdown.selectViaVisibleText(selectDepartment, departmentValue);
		textboxControl.setText(enterUsername, username);
		textboxControl.setText(enterPassword, password);
		textboxControl.setText(enterConfirmPassword, confirmPassword);
		textboxControl.setText(enterEmail, email);
		textboxControl.setText(enterContactNo, contactNo);
		elementControl.click(submitButton);

	}

	// Method to compare the values of password and confirm password field

	public void comaprisonPasswords(String confirmPassword, String password) throws Exception {

		if (password != confirmPassword) {

			throw new Exception("Passwords don't match");

		}

	}
	
	// Wrote a different method as class value of submit button got changed upon giving invalid phone value

	public void submitFormWithInvalidPhone(String firstname, String lastname, String username, String password,
			String confirmPassword, String email, String contactNo, String departmentValue) {

		try {

			textboxControl.setText(enterFirstName, firstname);
			textboxControl.setText(enterLastName, lastname);
			selectDropdown.selectViaVisibleText(selectDepartment, departmentValue);
			textboxControl.setText(enterUsername, username);
			textboxControl.setText(enterPassword, password);
			textboxControl.setText(enterConfirmPassword, confirmPassword);
			textboxControl.setText(enterEmail, email);
			textboxControl.setText(enterContactNo, contactNo);
			elementControl.click(submitButtonWithInvalidPhone);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
