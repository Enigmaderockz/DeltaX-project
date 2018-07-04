package com.deltaX.QATCs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterationFormDataDrivenTestNG extends BasicScenarios {
	
	

	@Test(dataProvider = "getData", dataProviderClass = utils.TestDataProvider.class)
	public void RegisterationWithDataDriven(String firstnameConfig, String lastnameConfig, String usernameConfig,
			String passwordConfig, String confirmPasswordConfig, String emailConfig, String contactNoConfig,
			String deptValueConfig) {

		try {

			registerUser.submitForm(firstnameConfig, lastnameConfig, usernameConfig, passwordConfig,
					confirmPasswordConfig, emailConfig, contactNoConfig, deptValueConfig);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}

	}

}
