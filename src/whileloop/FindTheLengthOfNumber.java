package whileloop;

public class FindTheLengthOfNumber {
	public static void main(String[] args) {
		int num=153;
		int len=0;
		while(num!=0) {
			len++;//condition to count the length of the number
			num/=10;
		}
		System.out.println(len);
	}
}
