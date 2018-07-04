package commonLibs.implementation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commonLibs.contracts.IDropdown;

public class DropdownControl implements IDropdown {

	private Select getDropdown(WebElement element) {

		Select dropdown = new Select(element);

		return dropdown;

	}

	public void selectViaVisibleText(WebElement element, String visibleText) throws Exception {

		getDropdown(element).selectByVisibleText(visibleText);

	}

	public void selectViaValue(WebElement element, String value) throws Exception {

		getDropdown(element).selectByValue(value);

	}

	public void selectViaIndex(WebElement element, int index) throws Exception {

		getDropdown(element).selectByIndex(index);

	}

}