package whileloop;
public class StrongNumber {
	public static void main(String[] args) {
		int num=145;
		int sum=0;
		while(num>0) {
			int last=num%10;
			int fact=1;
			int i=1;
			while(i<=last) {
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			num=num/10;
		}
		System.out.println(sum);
		if(sum==num) {
			System.out.println("this is strong num");
		}
		else {
			System.out.println("this is not strong NUM");
		}
	}

}
