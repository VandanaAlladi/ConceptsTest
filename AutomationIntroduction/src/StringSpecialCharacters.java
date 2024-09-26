
public class StringSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String a= "krb274@#&";
		String b="" ;
		String d="";
		String e="";
		
		for(char c:a.toCharArray()) {
			
			if(Character.isAlphabetic(c)) {
				
				b=b+c;
			}
			else if (Character.isDigit(c)){
				d=d+c;
				
				}
			else {
				e=e+c;
			}
		}
		System.out.println("alphabets: "+b);
		System.out.println("numeric: "+d);
		System.out.println("special characters:"+e);
		/*for(char e:a.toCharArray()) {
			
			if(Character.isDigit(e)) {
			d=d+e;
				
			}
			
		}
		
		System.out.println(d);
		
	}*/
	
	}
}
