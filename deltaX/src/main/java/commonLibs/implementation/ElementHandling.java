package commonLibs.implementation;

import org.openqa.selenium.WebElement;

import commonLibs.contracts.ICommonElements;

public class ElementHandling implements ICommonElements {

	public void click(WebElement element) throws Exception {

		element.click();

	}

}
