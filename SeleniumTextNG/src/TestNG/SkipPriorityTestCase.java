package TestNG;

import org.testng.annotations.Test;

public class SkipPriorityTestCase {
	
	@Test(priority=0)
	public void startCar() {
		System.out.println("Start The Car");
	}
	
	// Skip the Test Cases
	//------------------
	@Test(priority=1, enabled = false)
	public void putFirstGear() {
		System.out.println("First Gear");
	}//-------------------
	
	@Test(priority=2)
	public void putSecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("Fourth Gear");
	}

}
