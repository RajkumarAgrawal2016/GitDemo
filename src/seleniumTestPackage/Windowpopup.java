package seleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alertText = "Rajkumar";
		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(alertText);
		driver.findElement(By.xpath("//input[@value='Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		String alerttext1 = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(alerttext1);
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
