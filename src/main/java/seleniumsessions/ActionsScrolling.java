package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(1000);
//		
//		act.sendKeys(Keys.PAGE_UP).perform();
//		Thread.sleep(1000);
//		
		
		//CMD/CONTROL + Arrow Key up/down
		//COMMAND for mac and CONTROL for windows machine
		
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();

		
		//scroll to element:
		act.scrollToElement(driver.findElement(By.linkText("Help"))).
		pause(1000)
		.click(driver.findElement(By.linkText("Help"))).build().perform();
	}	
}
