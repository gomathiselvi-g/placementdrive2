package whileloop;

public class StrongNum {
public static void main(String[] args) {
	int num=145;
	int temp=num;
	int sum=0;
	while(num!=0) {
		int fact=1;
		int l=num%10;
		for(int i=1;i<=l;i++) {
			fact=fact*i;
		}
		sum+=fact;
		num/=10;
	}
	System.out.println(sum);
	if(temp==sum) {
		System.out.println("this is strong number");
	}
	else {
		System.out.println("this is not a strong number");
	}
}
}
