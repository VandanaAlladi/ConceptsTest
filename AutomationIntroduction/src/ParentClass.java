import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParentClass {

	@Test
	public void parentMethod() {
		
		System.out.println("I am from parent class");
	}
	
	@BeforeTest
	
	public void beforeTestMethodInParentClass() {
		System.out.println("before Test MethodInParentClass");
		
	}
	
	@AfterTest
	
	public void AfterTestMethod() {
		System.out.println("After test method in parent class");
	}

}
