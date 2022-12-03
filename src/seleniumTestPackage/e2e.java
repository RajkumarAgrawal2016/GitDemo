package seleniumTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:/Users/lenovo/eclipse-workspace/edgedriver/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://corporate.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value = 'DEL']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'BLR']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains(".5")) {
			System.out.println("Its disable");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")).click();
		driver.findElement(By.xpath("////span[@class = \"home-passenger-select-icon\"][4]")).click();

		// Assert.assertEquals(driver.findElement(By.xpath("//div[@id =
		// 'divpaxinfo']")).getText(), "4 Adult");

		System.out.println(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText());
		driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_btn_FindFlights']")).click();

	}

}
