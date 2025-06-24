package PP2;

import org.testng.annotations.Test;

public class Class1Test {

	@Test(groups = "smoke")
	public void m3Test() {
		System.out.println("m3 executed");
	}
	
	@Test(groups = "regression")
	public void m4Test() {
		System.out.println("m4 executed");
	}
}
