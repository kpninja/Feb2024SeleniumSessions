package testngsessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	String name;
	//@Test(priority=1,description="Add to cart test", expectedExceptions=ArithmeticException.class)
	//@Test(priority=1,description="Add to cart test", expectedExceptions={ArithmeticException.class,NullPointerException.clas})
	@Test(priority=1,description="Add to cart test", expectedExceptions=Exception.class)
	
	public void addToCart() {
		System.out.println("Addto cart test");
		
		int i=9/0;
		System.out.println("Hello");
		ExpectedExceptionConcept obj=null;
		System.out.println(obj.name);  //NPE
		
	}
}
