
public class ConstructorUsage  extends  SuperKeyWordUsage{

	 int i;
	 
	 //parameterized constuctor
	public ConstructorUsage(int a) {
		super(a);//invokes parent class constructor
		this.i=a;
	}
	
	
	public int increment() {
		
		i+=2;//5+2==7
		return i;
	}
	
	public int decrement() {
		i-=3;//6-1=5
		return i;		
	}

}
