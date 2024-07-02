package seleniumsessions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;

	public static void main(String[] args)  {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	 boolean flag = driver.findElement(By.id("input-email")).isDisplayed(); //right id - it will give true
//	 boolean flag = driver.findElement(By.id("input-email11")).isDisplayed(); //wrong id-no  such element exception
		//System.out.println(flag);
		//By.id("input-email"
	//   By emailId=By.id("input-email");
		By logo=(By.className("img-responsive"));
		//By logo=(By.xpath("//div[@id='logo']/a/img"));
		
//		if(doIsDsplayed(emailId)){
//			System.out.println("PASS");
//		}
//			else
//			{
//				System.out.println("Fail");
//		}
		
//		List<WebElement> emailIdList=driver.findElements(emailId);
//		
//		if(emailIdList.size()==1) {
//			System.out.println("email id is present on the page");
//		}
//		else {
//			System.out.println("email id iscoming more than two times");
//		}
		
		System.out.println(isElementDisplayed(logo));
		By fogotPwdLink=By.linkText("Forgotten Password");
		System.out.println(isElementDisplayed(fogotPwdLink ,4 ));
	}

  public static boolean isElementDisplayed(By locator) {
	int elementCount=driver.findElements(locator).size();
	if( elementCount==1) {
		System.out.println("Single element is  displayed:" +locator );
		return true;
	}
	else {
		System.out.println("Multiple or zero elemenst are  displayed:" +locator );
		return false;
	}
}

  public static boolean isElementDisplayed(By locator, int expectedElementCount) {
		int elementCount=driver.findElements(locator).size();
		if( elementCount==expectedElementCount) {
			System.out.println("Single element is  displayed:" +locator +"with the occurence of "+elementCount );
			return true;
		}
		else {
			System.out.println("Multiple or zero elemenst are  displayed:" +locator +"with the occurence of "+elementCount );
			return false;
		}
	}
		
   public static boolean doIsDsplayed(By locator) {
	try {
	boolean flag = getElement(locator).isDisplayed();
	System.out.println("Element is  displayed:" +locator );
	return flag;
}
	catch(NoSuchElementException e) {
		System.out.println("Element with locator:" +locator +"is not displayed");
		return false;
	}
	
}
public static WebElement getElement(By locator) {
	return driver.findElement(locator);
	}
}