package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessAndIncognito {

	public static void main(String[] args) {
		
		// headless mode:
		//no browser-blocking the browser visibility
		//not recommended-no user exp
		//when to use?--->headless based OS-linux,docker,VM
		// it might not work with complex html components
		
		
		ChromeOptions co=new ChromeOptions();
//		//co.addArguments("--headless");
	co.addArguments("--incognito");
		
	//	FirefoxOptions fo=new FirefoxOptions();
	//	co.addArguments("--headless");
	//	fo.addArguments("--incognito");
		
    WebDriver driver= new ChromeDriver(co);
//	WebDriver driver= new FirefoxDriver(fo);
		driver.get("https://www.google.com/");
   System.out.println(driver.getTitle());
   
  // driver.quit();
	}

}
