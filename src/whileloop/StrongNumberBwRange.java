package whileloop;

public class StrongNumberBwRange {
	public static void main(String[] args) {
		for(int k=1;k<=100000;k++) {
			int num=k;
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
		if(temp==sum) {
			System.out.println(sum);
		}
		
}
}
}