package seleniumsessions;

public class CustomXpath {

	public static void main(String[] args) {
		//xpath: address of the element in the HTM DOM
		
				//1. absolute xpath: 
				//   /html/body/div[2]/div/div/div/div/div[3]/form/div[1]/input
				//2. relative xpath/custom xpath
					//formula
					//xpath axes: relationship: parent, child, siblings
					//function

		//1. htmltag[@attr='value']
		        //input[@id='input-email']
				//input[@name='email']
				//input[@placeholder='E-Mail Address']
				
				//input -- 6 - FEs
				//input[@id]
				//input[@placeholder]
		
		//2.htmltag[@attr1='value' and @attr2='value' and @attr3='value']
				//input[@id='input-firstname' and @type='text' and @name='firstname']
				//input[@id='input-firstname' and @type='text' and @name]
				//input[@id and @type and @name]
				
		//3.htmltag[@attr1='value' or @attr2='value']
		           //input[@type='text' or @name='search' or @type='email']
		
		//4.//*[@attr='value']
		           //*[@type='text'] -- 100:3
		            //input[@type='text'] -- 14:3 --better performance
		
		//5.//text() in xpath:
		    //htmltag[text()='value']
		           //h1[text()='Register Account']
		           //legend[text()='Your Personal Details']
		           //a[text()='My Account']
		          //a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']
		
		//6.//contains() in xpath:
		     //contains with attribute:
		     //htmltag[contains(@attr,'value')]
		             //input[contains(@id,'email')]
	          	     //input[contains(@placeholder,'E-Mail')]
		
		//7.htmltag[contains(@attr1,'value') and @attr2='value']
				//input[contains(@placeholder,'E-Mail') and @name='email']
				
				//input[contains(@id='email')] -- wrong xpath
		
		//8.htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
				//input[contains(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//9.dynamic elements with dynamic attributes
				// <input id=firstname_12345/>
				// <input id=firstname_98878/>
				// <input id=firstname_76543/>
				//By.id("firstname_12345");
		//input[contains(@id,'firstname_')]
		
		
		//10. contains() with text():
		//htmltag[contains(text(),'value')]
				//h2[contains(text(),'New')]
				//p[contains(text(),'keep track of the orders')]
				//a[contains(text(),'Conditions')]
				//a[contains(text(),'Address') and @class='list-group-item']
				//a[@class='list-group-item' and contains(text(),'Address')]
		
		//11.starts-with():
		//htmltag[starts-with(@attr,'value')]
				//a[starts-with(@id,'firstname_')]
				//input[starts-with(@placeholder,'E-Mail')]
				//input[starts-with(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//ends-with: not available
		
		
		//12.starts-with() with text():
		//htmltag[starts-with(text(),'value')]
				//p[starts-with(text(),'By creating an account')]
		
		//13.indexing in xpath:
		// (//a[text()='Forgotten Password'])[2]
				//By.xpath("(//a[text()='Forgotten Password'])[2]");
				// (//input[@id])[6]
		
		//14.position() :
				// (//input[@id])[position()=1]
				// (//input[@id])[1]
		
		
		//15.last():
				// (//input[@id])[last()]
				// (//input[@id])[last()-1]
				// (//input[@id])[last()-last()+1]
				
				// ((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]

		//16.text with space:
		       //label[normalize-space()='Yes']
		       //label[normalize-space()='No']
	}

}
