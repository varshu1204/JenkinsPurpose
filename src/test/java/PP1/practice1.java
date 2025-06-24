package PP1;

import org.testng.annotations.Test;

public class practice1 {

	@Test(groups = "smoke")
	public void m1Test() {
		System.out.println("m1 executed");
	}
	
	@Test(groups = "regression")
	public void m2Test() {
		System.out.println("m2 executed");
	}
}
