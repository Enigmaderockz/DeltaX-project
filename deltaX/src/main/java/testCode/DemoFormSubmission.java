package testCode;

import org.openqa.selenium.WebDriver;

import com.deltaX.formApplication.registrationForm;

import commonLibs.implementation.Driver;

public class DemoFormSubmission {

	public static void main(String[] args) {

		try {
			Driver cmndriver = new Driver("chrome");

			cmndriver.setPageLoadTimeout(90);

			cmndriver.setElementDetectionTimeout(10);

			cmndriver.navigateToFirstUrl("http://bit.ly/dxqatest-online");

			WebDriver browserDriver = cmndriver.getDriver();

			registrationForm newUser = new registrationForm(browserDriver);

			newUser.submitForm("Abhinandan", "Mehandiratta", "enigmaderockz", "likehooding", "likehooding",
					"abhi.voyage@gmail.com", "8861246821", "Sales");
			
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
