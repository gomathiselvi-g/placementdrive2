package whileloop;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=256;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=sum+last;
			num=num/10;
		}
		System.out.println(sum);
	}
}