package TestNG;

import org.testng.annotations.Test;

public class DependenciesManage {
	
	
	// Used the dependsOnMethods arguments
	@Test(enabled = true)
	public void HighSchool() {
		System.out.println("I have completed 10th");
	}
	
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSecSchool() {
		System.out.println("I have completed 12th");
	}
	
	@Test(dependsOnMethods = "HigherSecSchool")
	public void CollegeUG() {
		System.out.println("I have completed UG");
	}
	
	@Test(dependsOnMethods = "CollegeUG")
	public void CollegePG() {
		System.out.println("I have completed PG");
	}
	
}
