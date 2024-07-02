package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//browser
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");//page
		
		//driver.switchTo().frame(2);
		
//	 	driver.switchTo().frame("main" );
		
	 //driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']"))) ;
		
//		String header = driver.findElement(By.tagName("h2")).getText();
//       System.out.println(header);
		
	List<WebElement> frameList = driver.findElements(By.xpath("//frame"));
	 System.out.println("number of frames:");
      System.out.println(frameList.size());
      System.out.println("Frames names are:");
      for(WebElement e:frameList) {
    	  String frameNames=e.getAttribute("name");
    	  System.out.println(frameNames);
      }
      
      
	}

}
