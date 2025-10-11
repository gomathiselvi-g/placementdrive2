package whileloop;

public class MinInNumber {
	public static void main(String[] args) {
		int num=12345;
		int min=num%10;
		while(num!=0) {
			if(min>num%10) {
				min=num%10;
			}
			num=num/10;
		}
		System.out.println(min);
	}
}
