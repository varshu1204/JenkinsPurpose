package PP1;

import org.testng.annotations.Test;

public class practice1Test {

	@Test(groups = "smoke")
	public void m1Test() {
		System.out.println("m1 executed");
		System.out.println("kjhgfds");
		System.out.println("abcd");
	}
	
	@Test(groups = "regression")
	public void m2Test() {
		System.out.println("m2 executed");
	}
}
