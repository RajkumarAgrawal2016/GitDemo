package seleniumTestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class GetErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/eclipse-workspace/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		String password = getPassword(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rajkumar");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//*[text()= 'Log Out']")).click();
		driver.close();

	}
	public static String getPassword(WebDriver driver) throws InterruptedException {
	
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String errortext = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String errortext1 = errortext.split("'")[1];
		String errortext2= errortext1.split("'")[0];
		return errortext2;
	}

}	
