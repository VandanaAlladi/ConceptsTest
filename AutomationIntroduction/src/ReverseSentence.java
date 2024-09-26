
public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="hello baby, how are you";
		char[] arr=sentence.toCharArray();
		
		String[] stringArr=sentence.split(" ");
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
			
		}
		System.out.println("************************************************************************");
		reverseArray(arr);
		splitSentence(sentence);
		reverseSentence(sentence);
	}
	
	public static void reverseArray(char[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
			
		}
		System.out.println("************************************************************************");
	}
	public static void splitSentence(String sentence)
	
	{
		String[] stringArr=sentence.split(" ");
		for(int j=0;j<stringArr.length;j++) {
			System.out.println(stringArr[j]);
		}
		
		System.out.println("************************************************************************");
	}
	
	public static void reverseSentence(String sentence)
	
	{		
		String[] stringArr=sentence.split(" ");
		
		for(int j=stringArr.length-1;j>=0;j--) {
			System.out.print(stringArr[j]+" ");
			
		}
		System.out.println("\n");
		System.out.println("************************************************************************");
	}

}
