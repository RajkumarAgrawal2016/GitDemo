package seleniumTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/eclipse-workspace/chromedriver.exe");
		WebDriver chrome = new ChromeDriver();

	}

}
