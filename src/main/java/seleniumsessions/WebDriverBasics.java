package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	public static void main(String[] args) {
		//To open the browser
		WebDriver driver = new ChromeDriver();
		
		//enter the url
		driver.get("https://www.google.com/");
		
		//get the title
		String title=driver.getTitle();
		System.out.println("The title is: " +title);
		
		//close the browser
		driver.close();
		System.out.println("Browser got closed");
	}
}
