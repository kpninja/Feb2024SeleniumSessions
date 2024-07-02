package seleniumsessions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();//browser
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		
		driver.findElement(By.cssSelector("img[title='Vehicle-Registration-Forms-and-Examples']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("House Registration");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Troy");
		driver.findElement(By.id("RESULT_TextArea-5")).sendKeys("I would like to Register my house on this Monday.");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("05/08/2024");
		//driver.findElement(By.xpath("//div//label[@id='q2_label']")).sendKeys("06/03/2024");
		
	   driver.findElement(By.cssSelector("#RESULT_FileUpload-6")).sendKeys("C:/Users/myhome/Downloads/Noon aide intent to return pdf (1).pdf");
		Thread.sleep(3000);
		
		driver.findElement(By.id("RESULT_TextField-8")).sendKeys("Naveen");
		driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Gupta");
    	driver.findElement(By.name("RESULT_TextField-10")).sendKeys("Apt-211");
    	driver.findElement(By.id("RESULT_TextField-11")).sendKeys("#1772 kirts blvd");
    	driver.findElement(By.id("RESULT_TextField-12")).sendKeys("Troy");
    	//driver.findElement(By.cssSelector("#RESULT_RadioButton-13")).sendKeys("Michigan");
    	
    	By State=(By.cssSelector("#RESULT_RadioButton-13"));
     	Select select_state = new Select(driver.findElement(State));
    	select_state.selectByVisibleText("Michigan");

     	driver.findElement(By.id("RESULT_TextField-14")).sendKeys("48085");
     	driver.findElement(By.xpath("//input[@placeholder='( ___ ) ___ - ____']")).sendKeys("2484671880");
     	     	driver.findElement(By.id("RESULT_TextField-16")).sendKeys("Naveen100@gmail.com");

    	driver.findElement(By.id("FSsubmit")).click();
    	
    	
     	
     	//driver.switchTo().defaultContent();//back to main page
		
//		String header = driver.findElement(By.cssSelector(".details__form-preview-title")).getText();
//		System.out.println(header);
		
				
	}

}
