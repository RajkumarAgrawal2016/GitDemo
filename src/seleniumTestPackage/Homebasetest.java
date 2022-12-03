package seleniumTestPackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Homebasetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		int j = 0;
		String[] vegs = { "Cucumber", "Brocolli", "Beetroot", "Carrot" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < productList.size(); i++) {

			String[] item = productList.get(i).getText().split("-");

			String formatedName = item[0].trim();

			Thread.sleep(2000);

			List vegsitemneed = Arrays.asList(vegs);

			if (vegsitemneed.contains(formatedName)) {

				j++;
				// click on add to cart
				driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
				if (j == vegs.length) {
					break;
				}
			}

		}

	}

}
