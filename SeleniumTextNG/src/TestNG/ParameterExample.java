package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

	@Test
	@Parameters("Name")
	public void PrintName(String Name) {
		System.out.println("Name is "+ Name);
		
	}
}
