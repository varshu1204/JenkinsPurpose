package PP2;

import org.testng.annotations.Test;

public class Class1 {

	@Test(groups = "smoke")
	public void m3() {
		System.out.println("m3 executed");
	}
	
	@Test(groups = "regression")
	public void m4() {
		System.out.println("m4 executed");
	}
}
