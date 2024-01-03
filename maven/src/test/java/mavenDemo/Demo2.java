package mavenDemo;

import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void demo1() {
		System.out.println("demo1-2");
	}
	@Test(priority=2,invocationCount=2)
	public void demo2() {
		System.out.println("demo2-2");
	}
	@Test(enabled=false)
	public void demo3() {
		System.out.println("demo3-2");
	}
}
