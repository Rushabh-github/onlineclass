package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation1 {
	
	@BeforeMethod
	public void BM()
	{
		System.out.println("hello");
	}
	@AfterMethod
	public void Am() {
		System.out.println("hii");
	}
	@Test
	public void Actitime()
	{
		System.out.println("Good morning");
	}
	@Test
	public void Facebook() {
		System.out.println("Jai ho");
	}

}
