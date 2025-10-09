package TestNG;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG {
	
	@Test(priority =-1)
	public void createChild() {
		System.out.println("Child is created");
	}
	
	@Test(dependsOnMethods= "createChild")
	public void modifyChild() {
		Assert.assertTrue(false);
		System.out.println("Defective Piece");
	}
	@Test(priority =1, dependsOnMethods = "modifyChild" )
	public void deleteChild() {
		System.out.println("Kill it");
	}
	
	}
