package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		//css: locator
		
		//1    id: #id
		//htmltag#id
		//input#input-email
		
		//2   .class: .className
				//htmltag.className
				// .form-control
				// input.form-control
				// img.img-responsive
		

		//3   .c1.c2.c3....cn
		//htmltag.c1.c2.c3...cn
		// input.form-control.input-lg
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// input.login-email
		// input.login-password
		
		//4     htmltag#id.classname
				//htmltag.classname#id
		
		//5     input#input-email.form-control
				// input.form-control#input-email
				// input.form-control.private-form__control.login-email#username
				// input#username.form-control.private-form__control.login-email
		
		//6   a.list-group-item --13 -- FEs
		
		//7    htmltag[attr='value']
				// input[name='email'] --css
				//input[@name='email'] --xpath
				// input[placeholder='E-Mail Address'] --css
				// input[id='input-email']
		
		//8   htmltag[attr1='value'][attr2='value'][attr3='value']
		//     input[id='input-email'][name='email'][placeholder='E-Mail Address'] ---css
		
		//9   input[id][name='email'][placeholder='E-Mail Address']
				// input[id][name][placeholder]
				
		//10  a[href]
				// input[name='email']#input-email
				// input#input-email[name='email']
				// input#input-email[name='email'].form-control
		
		//11 input[placeholder*='E-Mail'] --contains
				// input[placeholder^='E-Mail'] -- startswith
				// input[placeholder$='Address'] --endswith
				
				//text in css? -- not available
		
		//12. parent to child:
				// select#Form_getForm_Country > option -- direct
				// select#Form_getForm_Country option -- direct + indirect child elements
				
				// div#content form > div.form-group > input#input-email
				
				// nav#top > div -- direct = 1
				// nav#top  div -- direct + indirect = 4
				
				//child to parent/ancestor? -- not available : backward traversing in DOM is not allowed
		
		//13 indexing in css:
				// select#Form_getForm_Country > option:first-child
				// select#Form_getForm_Country > option:last-child
				// select#Form_getForm_Country > option:nth-child(15) -- start from top
				// select#Form_getForm_Country > option:nth-child(n) -- all from top
				// select#Form_getForm_Country > option:nth-last-child(4) -- start from bottom
				// select#Form_getForm_Country > option:nth-child(odd)
				// select#Form_getForm_Country > option:nth-child(even)
				// select#Form_getForm_Country > option:nth-child(n+4) -- start from 4th element
		        // select#Form_getForm_Country > option:nth-child(4n)
		
		//14  odd/even in xpath:
				// n%2==0 -- even
				// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =0] -- even
				// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =1] -- odd
				
			

		//15  indexing in css:
			     // select#Form_getForm_Country > option:first-child
			    // select#Form_getForm_Country > option:last-child
			    // select#Form_getForm_Country > option:nth-child(15) -- start from top
			 	// select#Form_getForm_Country > option:nth-child(n) -- all from top
				// select#Form_getForm_Country > option:nth-last-child(4) -- start from bottom
				// select#Form_getForm_Country > option:nth-child(odd)
				// select#Form_getForm_Country > option:nth-child(even)
		// select#Form_getForm_Country > option:nth-child(n+4) -- start from 4th element
		// select#Form_getForm_Country > option:nth-child(4n)
		
		//16   odd/even in xpath:
				// n%2==0 -- even
				// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =0] -- even
				// (//select[@id='Form_getForm_Country']/option)[position() mod 2 =1] -- odd
				
				
		//17  comma in css:
		// input#username,input#password,button#loginBtn,input#remember
//						By loginFields = By.cssSelector("input#username,input#password,button#loginBtn,input#remember");
//						int loginFieldsCount = driver.findElements(loginFields).size();
//						
//						System.out.println(loginFieldsCount);
//						if(loginFieldsCount == 4) {
//							System.out.println("imp elememnts are availabe on the login page");
//						}
		
		//18  union operator in xpath:
				//footer//a | //footer//h5
				//footer//a | //footer//h5 | //footer//p
		
		// 19 h5[text()='Extras']/following-sibling::ul//a
		
		//20 not in css:
				// input.form-control:not(input[name='search'])
				// input.form-control:not(input[name='search']):not(input#input-firstname)
				
		//1. with class name - only one class is allowed
		
		//invalid
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");
		//InvalidSelectorException: Compound class names not permitted
		
		//valid
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		//valid
//		driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']"))
//					.sendKeys("test@gmail.com");
		
		
		//valid
		//driver.findElement(By.cssSelector("input.form-control.private-form__control.login-email")).sendKeys("test@gmail.com");
		
		
		//performance:
//		1000 ---xpath -- xpath engine in browser
//		1000 -- css
		
		

		
	//	              xpath    vs      css:
//	1. syntax:         medium          easy
//	2. performance:    slow				faster
//	3. backward:       yes				no
//	4. sibling: 		yes				yes -- only following siblings
//	4. text:            yes             no
//	5. ancestor:        yes             no
//	6. index:           yes             yes -- better
//	7. startswith:      yes              yes
//	8. contains:        yes              yes
//	9. endswith:        no               yes
//	10. comma/union		yes				yes
//	11. and				yes				yes
//	12. or 				yes				no
//	13. not: 			yes				yes
//	14. SVG: 			yes				no
//	15. shadowDOM: 		no				yes
	
		
		
		
		
	}

}
