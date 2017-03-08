package test.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "path of geckodriver");
		WebDriver driver= new FirefoxDriver();
		String baseURL="https://www.google.com";
		System.out.println(baseURL);
		driver.get(baseURL);
		System.out.println("Hello");

	}

}
