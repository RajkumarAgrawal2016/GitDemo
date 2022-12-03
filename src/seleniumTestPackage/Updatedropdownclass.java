package seleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Updatedropdownclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		 for (int i = 1; i<5 ; i++) {
			 driver.findElement(By.id("hrefIncAdt")).click();
		 }
		/*
		 * while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
