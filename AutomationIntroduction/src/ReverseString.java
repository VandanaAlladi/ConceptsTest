
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original="KALYANI";
		//Array[] a=String Array[original.toCharArray()];
		//char ch;
		String reversed=new String();
		
		for(int i=0;i<original.length();i++) {
			reversed=original.charAt(i)+reversed;
			
		}
		
		System.out.println(reversed);

	}

}
