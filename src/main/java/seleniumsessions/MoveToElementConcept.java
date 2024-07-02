package seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("");
		
	Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("a.menulink"))).perform();
		//act.moveToElement(driver.findElement(By.linkText("COURSES"))).build().perform();
	Thread.sleep(2000);
		driver.findElement(By.linkText("COURSES")).click();

		
		//driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
	
//		By contentMenu = By.cssSelector("a.menulink");
//		
//		By coursesLink = By.linkText("COURSES");
//		
//		handleParentSubMenu(contentMenu,coursesLink);
		
		// another site to test
		
//		driver.get("https://www.spicejet.com/");
//		By addons = By.xpath("//div[text()='Add-ons']");
//		By spicePlus = By.xpath("//div[text()='SpicePlus']");
//
//		handleParentSubMenu(addons, spicePlus);
		
	}

//	public static void handleParentSubMenu(By parentLocator, By childLocator) throws InterruptedException {
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(driver.findElement(parentLocator)).perform();
//
//		Thread.sleep(2000);
//
//		driver.findElement(childLocator).click();

	}
