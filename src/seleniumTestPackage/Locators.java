package seleniumTestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/lenovo/eclipse-workspace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Rajkumar");
		driver.findElement(By.name("inputPassword")).sendKeys("jhjhjjhh");
		driver.findElement(By.className("signInBtn")).click();
		//CSSSelector  tagname.classname,   tagname#id,   tagname[attribute= "value"]    tagname[attribute = 'value']:nth-child(index) if multiple match
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();	
		
		//Xpath   //tagname[@attribute= "value"]  //tagname[@attribute = 'value'][index] if multiple match ,   parent child locator - parenttagname childtagname
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[placeholder = 'Email']")).sendKeys("abc@abc.com");
		driver.findElement(By.xpath("//input[@type ='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type ='text']:nth-child(3)")).sendKeys("rajkumar@abc.com");
		
		//parent to child xpath locator using tags only  //parenttag/childtag    , parenttag/childtag(index)
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("012321234567");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Using xpath
		//System.out.println(driver.findElement((By.xpath("//p[@class = 'infoMsg']"))).getText());
		//using CSS selector
		System.out.println(driver.findElement((By.cssSelector("form p"))).getText());
		
		driver.findElement(By.xpath("//div[@class = 'forgot-pwd-btn-conainer']/button[1]")).click();
		
		//generate CSSselector using the regular expression
		
		//   input[type*='pass']
		
		
		
		
			
	}

}
