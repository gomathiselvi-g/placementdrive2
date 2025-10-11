package whileloop;

public class SpyNumber {
	public static void main(String[] args) {
		int num=123;
		int sum=0;
		int temp=1;
		while(num!=0) {
			int last=num%10;
			sum=sum+last;
			temp=temp*last;
			num=num/10;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("this is a spy number");
		}
		else {
			System.out.println("this is not a spy number");
		}

	}
}
