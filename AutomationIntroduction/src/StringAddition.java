import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String S="A5B3C1";
		int sum=0;
		int num=0;
		//char[] arr=S.toCharArray();
		
		/*for(int i=0;i<arr.length;i++) {
		//System.out.println(arr[i]);
			if(Character.isDigit(arr[i])) {
			num=Character.getNumericValue(arr[i]);
			//System.out.println(num);
			System.out.println(num);
			sum=sum+num;
			System.out.println("sum in for="+sum);
		}
		
		
	}
		
		System.out.println("sum="+sum);*/
		
		
		System.out.println("****************using for each loop****************");
		
		for(char c: S.toCharArray()) {
			if(Character.isDigit(c)) {
			num=Character.getNumericValue(c);
			sum+=num;
			}
		}
		System.out.println(sum);

}

}