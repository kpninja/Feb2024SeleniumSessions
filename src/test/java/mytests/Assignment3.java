package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment3 extends BaseTest{
	@Parameters({"username", "Password"} )
	@Test(description = " login to page title...",priority=1)
	 public void login(String username,String Password ) {
			driver.findElement( By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@type='submit']")).submit();
			driver.switchTo().frame("mainpanel");
			 }
	@Test(description = " Create User...",priority=2)
	public void createUser() {
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).perform();


	driver.findElement(By.xpath("//a[@title='New Contact']")).click();
	WebElement title=driver.findElement(By.name("title"));
	Select select = new Select(title);
	select.selectByValue("Mrs.");
	driver.findElement( By.name("first_name")).sendKeys("Suji");
	driver.findElement( By.id("surname")).sendKeys("Gupta");
	//driver.findElement(By.name("image_file")).sendKeys("");

	WebElement status= driver.findElement(By.name("status"));
	Select sel=new Select(status);
	sel.selectByValue("New");

	driver.findElement(By.id("mobile")).sendKeys("9886725854");

	driver.findElement(By.cssSelector("#contactForm > table > tbody > tr:nth-child(1) > td > input:nth-child(2)")).click();
	}
	
	
}
