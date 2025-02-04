package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		//This language option is not available in USA
        List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(langLinks.size());
		
		for(WebElement e : langLinks) {
			String text = e.getText();
			System.out.println(text);
				if(text.equals("मराठी")) {
					e.click();
					break;
				}
		}
//		driver.findElement(By.tagName("a")).click();

	}

}
