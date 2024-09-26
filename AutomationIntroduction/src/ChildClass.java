import org.testng.annotations.Test;

public class ChildClass extends ParentClass{
	
	
	@Test
	public void getConstuctorClass() {
		
	//we are sending parameters at the time of object creation itself, instead of sending parameters to each and
		//every method present in this class, then we need constructor, this key word is used to mention class level variable
	ConstructorUsage cu=new ConstructorUsage(5);

	
	System.out.println(cu.increment());
	System.out.println(cu.decrement());
	
	
	System.out.println(cu.multiplybyTwo());
	System.out.println(cu.multiplyByThree());
	
	
	}
	@Test
	public void getParentClassMethod() {
		
		
		
		
	}

}
