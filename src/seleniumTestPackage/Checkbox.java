package seleniumTestPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 System.out.println(driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).click();//use reguler expression instead of whole text
		 System.out.println(driver.findElement(By.cssSelector("input[id = 'ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		
		 System.out.println(driver.findElements(By.cssSelector("input[type = 'checkbox' ]")).size());
		 
		
		
		
	}

}
