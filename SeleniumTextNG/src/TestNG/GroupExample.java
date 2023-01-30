package TestNG;

import org.testng.annotations.Test;

public class GroupExample {

	@Test(groups = {"Apple"})
	public void Apples1() {
		System.out.println("Apple testing");		
	}
	@Test(groups = {"Apple"})
	public void Apples2() {
		System.out.println("Apple testing");		
	}
	@Test(groups = {"Moto"})
	public void Moto1() {
		System.out.println("Moto testing");		
	}
	@Test(groups = {"Moto"})
	public void Moto2() {
		System.out.println("Moto testing");		
	}
	@Test(groups = {"Vivo"})
	public void Vivo1() {
		System.out.println("VIVO testing");		
	}
	@Test(groups = {"Vivo"})
	public void Vivo2() {
		System.out.println("VIVO testing");		
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo1() {
		System.out.println("Lenovo testing");		
	}
	@Test(groups = {"Lenovo"})
	public void Lenovo2() {
		System.out.println("Lenovo testing");		
	}
}
