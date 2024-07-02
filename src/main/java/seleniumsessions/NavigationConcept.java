package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	// go to url
		// back
		// forward
		// refresh
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   driver =new ChromeDriver();
   driver.navigate().to("https://www.google.com");
   System.out.println(driver.getTitle());
   
   driver.get("https://www.amazon.com");
   System.out.println(driver.getTitle());
   
   driver.navigate().back();
   System.out.println(driver.getTitle());
   
   driver.navigate().forward();
   System.out.println(driver.getTitle());
   
   driver.navigate().back();
   System.out.println(driver.getTitle());
   
	}

}
