package commonLibs.implementation;

import commonLibs.contracts.IDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Driver implements IDriver {

	private WebDriver driver;
	private int pageLoadTimeout;
	private int elementDetectionTimeout;

	public WebDriver getDriver() {
		return driver;
	}

	public void setPageLoadTimeout(int pageLoadTimeout) {
		this.pageLoadTimeout = pageLoadTimeout;
	}

	public void setElementDetectionTimeout(int elementDetectionTimeout) {
		this.elementDetectionTimeout = elementDetectionTimeout;
	}

	public Driver(String browserType) throws Exception {

		pageLoadTimeout = 5;
		elementDetectionTimeout = 60;

		browserType = browserType.trim();

		if (browserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Abhinandan\\eclipse-workspace\\libs\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserType.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Abhinandan\\eclipse-workspace\\libs\\Edgedriver_win32\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();

		} else {
			throw new Exception("Invalid Browser type : " + browserType);

		}
	}

	public void navigateToFirstUrl(String url) throws Exception {

		url = url.trim();

		if (url.isEmpty() || url == null) {

			throw new Exception("Url is empty or null");

		}

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(pageLoadTimeout, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(elementDetectionTimeout, TimeUnit.SECONDS);

		driver.get(url);

		driver.manage().window().maximize();

	}

	public String getCurrentUrl() throws Exception {

		return driver.getCurrentUrl();

	}

	public void closeAllBrowsers() throws Exception {

		driver.quit();

	}

}
