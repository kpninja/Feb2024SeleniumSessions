package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {
        //JS alerts
		//1. alert()
		//2.prompt()
		//3.confirm()
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {

			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//1. alert
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert=driver.switchTo().alert();
//        String text=alert.getText();
//        System.out.println(text);
//        alert.accept();         //ok button
//        alert.dismiss();       //cancel
        
        
     //   2.prompt()
//        driver.findElement(By.xpath("//button[text()='Click for JS confirm']")).click();
//        Alert alert=driver.switchTo().alert();
//        String text=alert.getText();
//        System.out.println(text);
//       // alert.accept();         //ok button
//        alert.dismiss();       //cancel
        
      //3.confirm() 
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        System.out.println(text);
        alert.sendKeys("test automation");
       alert.accept();         //ok button
       // alert.dismiss();       //cancel
        
	}

}
