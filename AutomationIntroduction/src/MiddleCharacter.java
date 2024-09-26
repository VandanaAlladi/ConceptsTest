
public class MiddleCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="sony";
		
		int middle=a.length()/2;
		System.out.println(middle);
		if((a.length()%2)==1) {
			System.out.println(a.charAt(middle));
		}
		else
		{
			System.out.print(a.charAt(middle-1));
			System.out.println(a.charAt(middle));
		}
		
		System.out.println(usingSubstring(a));
		

	}
	
	public static String usingSubstring(String b) {
		
		  int length = b.length();

	        if (length == 0) {
	            return ""; // Handle empty string case
	        }

	        int midIndex = length / 2;

	        // Check for odd or even length
	        if (length % 2 == 0) {
	            // Even length: return two middle characters
	            return b.substring(midIndex - 1, midIndex + 1);
	        } else {
	            // Odd length: return the middle character
	            return b.substring(midIndex, midIndex + 1);//substring last index prints value-1
	        }
	    }
	
		
	}


