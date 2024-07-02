package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForMultipleElements {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
	By topLinks=By.cssSelector("div#navbar-collapse  a");
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	List<WebElement>topLinks1ist= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(topLinks));
//	System.out.println(topLinks1ist);
	
	
	//  An expectation for checking that there is at least one element present on a web page
	int topLinksCount= waitForPresenceOfElementsLocated(topLinks,10).size();
	System.out.println(topLinksCount);
	}
	
	/**
	 *  An expectation for checking that there is at least one element present on web page
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
public static  List<WebElement> waitForPresenceOfElementsLocated(By locator,int timeOut){
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
}

/**
 *  An expectation for checking all the elements present on web page that matches the locator are visible.
 *  visibility means that the elements are not only displayed but also have a height and width that is greater than 0.
 * @param locator
 * @param timeOut
 * @return
 */



public static  List<WebElement> waitForVisibilityOfElementsLocated(By locator,int timeOut){
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
}
}
