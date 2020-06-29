package com.qa.hubspot.utills;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManger {

	public Properties prop;
	
	public ChromeOptions co;
	public FirefoxOptions fo;
	
	
	public OptionsManger(Properties prop) {
		
		this.prop=prop;
	}
	
	public ChromeOptions getChromeOptions() {		
		co = new ChromeOptions();		
		if(Boolean.parseBoolean(prop.getProperty("headless"))) co.addArguments("--headless");
		if(Boolean.parseBoolean(prop.getProperty("incognito"))) co.addArguments("--incognito");		
		return co;		
	}
	
	public ChromeOptions getFirefoxOptions() {		
		fo = new FirefoxOptions();		
		if(Boolean.parseBoolean(prop.getProperty("headless"))) fo.addArguments("--headless");
		//if(Boolean.parseBoolean(prop.getProperty("incognito"))) fo.addArguments("--incognito");		
		return co;		
	}
	
}
