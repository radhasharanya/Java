package test.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		String baseURL="http://www.google.com";
		driver.get(baseURL);
		

	}

}
