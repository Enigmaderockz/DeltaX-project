package com.deltaX.QATCs;

import org.testng.Assert;
import org.testng.annotations.Test;

// TC to do validations by providing valid data

public class RegisterationFormTestNG extends BasicScenarios {

	@Test(priority = 10)
	public void registerUserWithValidData() {

		try {

			logger = report.createTest("TC01: Form registration with valid data");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURL");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing invalid first name i.e. less than 2 chars

	@Test(priority = 20)
	public void registerUserWithInvalidFirstname() {

		try {

			logger = report.createTest("TC02: Form registration with invalid first name");

			String invalidFirstnameConfig = ReadProperty.getProperty("fistnameWithOneLetter");
			logger.info(invalidFirstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(invalidFirstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing numerical first name

	@Test(priority = 30)
	public void registerUserWithNumericalFirstname() {

		try {

			logger = report.createTest("TC03: Form registration with numerical first name");

			String numericalFirstnameConfig = ReadProperty.getProperty("numericalFirstName");
			logger.info(numericalFirstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(numericalFirstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing invalid last name i.e less than 2 chars

	@Test(priority = 40)
	public void registerUserWithInvalidLastname() {

		try {

			logger = report.createTest("TC04: Form registration with invalid last name");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String invalidLastnameConfig = ReadProperty.getProperty("lastnameWithBlankValue");
			logger.info(invalidLastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, invalidLastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	// // TC to do validations by providing alpha numerical last name

	@Test(priority = 50)
	public void registerUserWithAlphaNumericalLastname() {

		try {

			logger = report.createTest("TC05: Form registration with alpha numerical last name");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String alphaNumericalLastnameConfig = ReadProperty.getProperty("alphaNumericalLastname");
			logger.info(alphaNumericalLastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, alphaNumericalLastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	// // TC to do validations by providing invalid username i.e. less than 8 chars

	@Test(priority = 60)
	public void registerUserWithInvalidUsername() {

		try {

			logger = report.createTest("TC06: Form registration with invalid username");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String invalidUsernameConfig = ReadProperty.getProperty("usernameWithSixChars");
			logger.info(invalidUsernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, invalidUsernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing invalid password i.e. less than 8 chars

	@Test(priority = 70)
	public void registerUserWithInvalidPassword() {

		try {

			logger = report.createTest("TC07: Form registration with invalid password");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String invalidPasswordConfig = ReadProperty.getProperty("passwordwithSixChars");
			logger.info(invalidPasswordConfig);

			String invalidConfirmPasswordConfig = ReadProperty.getProperty("invalidConfirmPassword");
			logger.info(invalidConfirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, invalidPasswordConfig,
					invalidConfirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing different value in confirm password

	@Test(priority = 80)
	public void registerUserWithInvalidConfirmPassword() {

		try {

			logger = report.createTest("TC08: Form registration with invalid confirm password");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String invalidConfirmPasswordConfig = ReadProperty.getProperty("invalidConfirmPassword");
			logger.info(invalidConfirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					invalidConfirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

			// Below call will throw an exception if different value in confirm password is
			// given

			registerUser.comaprisonPasswords("passwordConfig", "confirmPasswordConfig");

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing blank email

	@Test(priority = 90)
	public void registerUserWithNoEmailID() {

		try {

			logger = report.createTest("TC09: Form registration with blank emailID");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String noEmailConfig = ReadProperty.getProperty("noEmail");
			logger.info(noEmailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, noEmailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing invalid email ID

	@Test(priority = 100)
	public void registerUserWithInvalidEmailID() {

		try {

			logger = report.createTest("TC10: Form registration with invalid emailID");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String invalidEmailConfig = ReadProperty.getProperty("invalidEmail");
			logger.info(invalidEmailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, invalidEmailConfig, contactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

	// TC to do validations by providing blank phone

	@Test(priority = 110)
	public void registerUserWithNoContactNo() {

		try {

			logger = report.createTest("TC11: Form registration with NO phone number");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String noContactNoConfig = ReadProperty.getProperty("noContact");
			logger.info(noContactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, noContactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURL");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	// TC to do validations by providing no dept value

	@Test(priority = 120)
	public void registerUserWithNoDeptValue() {

		try {

			logger = report.createTest("TC12: Form registration with no department value");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String contactNoConfig = ReadProperty.getProperty("contactNo");
			logger.info(contactNoConfig);

			String noDeptValueConfig = ReadProperty.getProperty("noDeptValue");
			logger.info(noDeptValueConfig);

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, noDeptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURL");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

	// TC to do validations by providing invalid phone

	@Test(priority = 130)
	public void registerUserWithInvalidPhone() {

		try {

			logger = report.createTest("TC13: Form registration with invalid phone value");

			String firstnameConfig = ReadProperty.getProperty("firstname");
			logger.info(firstnameConfig);

			String lastnameConfig = ReadProperty.getProperty("lastname");
			logger.info(lastnameConfig);

			String usernameConfig = ReadProperty.getProperty("username");
			logger.info(usernameConfig);

			String passwordConfig = ReadProperty.getProperty("password");
			logger.info(passwordConfig);

			String confirmPasswordConfig = ReadProperty.getProperty("confirmPassword");
			logger.info(confirmPasswordConfig);

			String emailConfig = ReadProperty.getProperty("email");
			logger.info(emailConfig);

			String InvalidContactNoConfig = ReadProperty.getProperty("invalidContact");
			logger.info(InvalidContactNoConfig);

			String deptValueConfig = ReadProperty.getProperty("deptValue");
			logger.info(deptValueConfig);

			registerUser.submitFormWithInvalidPhone(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, InvalidContactNoConfig, deptValueConfig);

			String actualURL = browserDriver.getCurrentUrl();
			logger.info("Actual URL" + actualURL);
			String expectedURL = ReadProperty.getProperty("expectedURLWithInvalidData");
			logger.info("Expected URL" + expectedURL);
			Assert.assertEquals(actualURL, expectedURL);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	}

}
