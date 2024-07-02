package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class classicCRMPro extends BaseTest {
	
	
	
	@Parameters({"username", "Password"} )
	@Test(description = " login to page title...",priority=1)
	 public void login(String username,String Password ) {
			driver.findElement( By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(Password);
			driver.findElement(By.xpath("//input[@type='submit']")).submit();
			driver.switchTo().frame("mainpanel");
			 }
	
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"Mr.","Ravi", "selenium","Active", "9876543223"},
			{"Mrs.","Anita", "sharma", "New","7876543223"},
			{"Dr.","Praful", "Gargi", "Hot","6876543223"}
		};
	}
	
	@Test(dataProvider = "getRegTestData",priority=2)

	public void clickOnContact(String title,String firstName, String surname, String status, String mobile)  {
        Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).perform();
		
		driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		
		WebElement title1=driver.findElement(By.name("title"));
		Select select = new Select(title1);
		select.selectByValue(title);
		
		driver.findElement( By.name("first_name")).sendKeys(firstName);
		driver.findElement( By.id("surname")).sendKeys(surname);
		//driver.findElement(By.name("image_file")).sendKeys("");

		WebElement CurentStatus= driver.findElement(By.name("status"));
		Select sel=new Select(CurentStatus);
		sel.selectByValue(status);

		driver.findElement(By.id("mobile")).sendKeys(mobile);

		driver.findElement(By.cssSelector("#contactForm > table > tbody > tr:nth-child(1) > td > input:nth-child(2)")).click();
		//driver.switchTo().frame("mainpanel");
		act.moveToElement(driver.findElement(By.xpath("//a[@title='Contacts']"))).perform();
	}

}
