package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBackgroundColor {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
	String color=login.getCssValue("backgroundColor");
	System.out.println(color);
  }
}
