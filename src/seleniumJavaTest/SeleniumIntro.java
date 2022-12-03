package seleniumJavaTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumIntro {

	public static void main(String[] args) {

		//Invoking Browser

		//Chrome - ChromeDriver exten->Methods close get

		//Firefox- FirefoxDriver ->methods close get

		// WebDriver  close  get

		//WebDriver methods + class methods

		// Chrome

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\ChromeDriver\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();

		System.setProperty("webdriver.edge.driver", "C:\\Users\\lenovo\\eclipse-workspace\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		//Firefox

		//System.setProperty("webdriver.gecko.driver", "/Users/rahulshetty/Documents/geckodriver");

		//WebDriver driver1 = new FirefoxDriver();

		//Microsoft Edge

		//System.setProperty("webdriver.edge.driver", "/Users/rahulshetty/Documents/msedgedriver");

		//WebDriver driver2 = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		System.out.println("Demoproject created");
		System.out.println("Demoproject started");
		System.out.println("Demoproject closed");
		
		System.out.println("Demoproject1");
		System.out.println("Demoproject2");
		System.out.println("Demoproject3");
		

		driver.close();

		//driver.quit();



		}
}
