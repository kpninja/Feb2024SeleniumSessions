package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ShadowDOMEmentHandle {
	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		//Thread.sleep(5000);
		
		String jsScript = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
				
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		WebElement pizza = (WebElement)js.executeScript(jsScript);
		pizza.sendKeys("Veg Pizaa");
//		driver.switchTo().frame("pact1");
//		String js1Script ="return document.querySelector(\"#glaf\")";
//		JavascriptExecutor js1 = (JavascriptExecutor) (driver);
//		WebElement destiny = (WebElement)js1.executeScript(js1Script);
//		destiny.sendKeys("Learning");
	}
}
