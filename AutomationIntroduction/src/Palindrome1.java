
import java.util.*;   


public class Palindrome1 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a string/number");
		
		String original=scanner.nextLine();
		String reverse="";
		
		for(int i=original.length()-1;i>=0;i--) {
			
			reverse=reverse+original.charAt(i);
		}
		System.out.println(reverse);
		if(original.equalsIgnoreCase(reverse)) {
			System.out.println(original+" is a palindrome");
		}
		else {
			System.out.println(original+" is not  a palindrome");
		}
		
		
		
	}
	}