
public class SwapStrings {

	public static void main(String[] args) {
		
		String a="Vandana";
		System.out.println("a="+a);
		System.out.println("a.length="+a.length());
		
		String b="Chandana";
		System.out.println("b="+b);
		System.out.println("b.length="+b.length());
		a=a+b;
		System.out.println(a);
		System.out.println("total length="+a.length());
		//GaneshaShiva
		//a=Shiva and b=Ganesha
		b=a.substring(0,a.length()-b.length());
		System.out.println("b after swap="+b);
		//System.out.println(b);
		a=a.substring(b.length());
		System.out.println("a after swap="+a);
		//System.out.println(a);
		
		
		

	}

}
