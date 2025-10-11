package whileloop;

public class Pallindrome {
	public static void main(String[] args) {
		int num=256;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int last=num%10;
			sum=(sum*10)+last;
			num=num/10;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
			
		}
	}

}
