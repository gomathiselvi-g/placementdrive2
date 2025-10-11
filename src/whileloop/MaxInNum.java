package whileloop;

public class MaxInNum {
	public static void main(String[] args) {
		int num=12345;


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int max=num%10;
		while(num!=0) {
			if(max<num%10) {
				max=num%10;
			}
			num=num/10;
		}
		System.out.println(max);
	}
}
