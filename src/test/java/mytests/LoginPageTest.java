package mytests;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

	@Parameters({"emailId", "Password"} )
	@Test(description = " login to page title...")
	 public void login(String emailId,String Password ) {
			driver.findElement( By.id("input-email")).sendKeys(emailId);
			driver.findElement(By.id("input-password")).sendKeys(Password);
			driver.findElement(By.cssSelector("input.btn-primary")).submit();
	 }
	
	
	@DataProvider
	public Object[][] getRegTestData() {
		return new Object[][] {
			{"macbook", "2" },
			
		{"macbook Air", "2" },
			
		{"macbook Pro", "2" },
		
		{"Samsung SyncMaster 941BW", "2"}
		};
	}

	
	
	@Test(dataProvider = "getRegTestData")
	public void searchTest(String device, String numOfDevice ) {
		driver.findElement(By.name("search")).sendKeys(device);
		driver.findElement(By.cssSelector("div button .fa-search")).click();
		driver.findElement(By.xpath("(//h4/a)")).click();
		driver.findElement(By.id("input-quantity")).clear();
	driver.findElement(By.id("input-quantity")).sendKeys(numOfDevice);
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		
		driver.findElement(By.name("search")).clear();

		}

}
