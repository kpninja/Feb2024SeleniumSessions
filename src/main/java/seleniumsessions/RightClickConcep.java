package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcep {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		
		//right click ---> context click --> context menu
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions act = new Actions(driver);
		By rightClickEle= By.xpath("//span[text()='right click me']");
		act.contextClick(driver.findElement(rightClickEle)).perform();

		List<WebElement> optionsList = driver.findElements(By.cssSelector("ul.context-menu-list > li.context-menu-icon > span"));
		
		
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			
				if(text.equals("Copy")) {
					e.click();
					Thread.sleep(2000);
					driver.switchTo().alert().accept();
					
//					//break;
				}
			
		}
	}	
}
