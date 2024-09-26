
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="masam";
		
		StringBuffer sbf=new StringBuffer(a);
		
		StringBuffer b=sbf.reverse();
		String c=b.toString();
		if(a.equalsIgnoreCase(c)) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
