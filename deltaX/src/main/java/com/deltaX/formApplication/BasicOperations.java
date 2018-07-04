package com.deltaX.formApplication;

import org.openqa.selenium.WebDriver;

import commonLibs.implementation.Driver;
import commonLibs.implementation.DropdownControl;
import commonLibs.implementation.ElementHandling;
import commonLibs.implementation.TextboxControls;

public class BasicOperations {

	public DropdownControl selectDropdown;

	public TextboxControls textboxControl;
	
	public ElementHandling elementControl;

	public Driver cmndriver;

	public BasicOperations(WebDriver driver) {

		selectDropdown = new DropdownControl();

		textboxControl = new TextboxControls();
		
		elementControl = new ElementHandling();

	}

}
