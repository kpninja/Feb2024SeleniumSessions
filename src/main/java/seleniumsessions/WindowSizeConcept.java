package seleniumsessions;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSizeConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//			driver.manage().window().fullscreen();
//			driver.manage().window().minimize();
		Dimension dim = new Dimension(400, 900);
		driver.manage().window().setSize(dim);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
  }
}