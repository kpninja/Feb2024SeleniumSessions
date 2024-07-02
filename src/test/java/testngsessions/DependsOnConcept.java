package testngsessions;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
@Test
	public void loginTest() {
		System.out.println("search test");
		int i=9/0;
	}

@Test(dependsOnMethods="loginTest")
public void searchTest() {
	System.out.println("search test");
}

  //AAA: Arrange, Act and Assert
}
