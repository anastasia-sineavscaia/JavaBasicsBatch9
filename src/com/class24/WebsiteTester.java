package com.class24;

public class WebsiteTester {

	public static void main(String[] args) {
		
		WebDriver webDriver=new FireFox();
		webDriver.openWebsite();
		webDriver.signupWebsite();
		webDriver.downloadAFileFromWebsite();
		webDriver.closeWebsite();
		
		/*FireFox fireFox=new FireFox();
		//fireFox.openWebsite();
		//fireFox.signupWebsite();
		//fireFox.downloadAFileFromWebsite();
		//fireFox.closeWebsite();*/
		
		WebDriver[] webDriverArray= {new GoogleChrome(),new FireFox()};
		for(WebDriver webdriver:webDriverArray) {
			webDriver.openWebsite();
			webDriver.signupWebsite();
			webDriver.downloadAFileFromWebsite();
			webDriver.closeWebsite();
		}

	}

}
