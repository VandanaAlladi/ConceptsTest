
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Abc123Xyz";
		//output should be AbcXyz123;
		
		
		String b=a.replaceAll("[0-9]", "");
		String c=a.replaceAll("[^0-9]", "");
		String d=b.concat(c);
		System.out.println(d);
		
		
		
	}

}
