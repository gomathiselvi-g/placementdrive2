package forloop;
public class SumtheFactorial {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
		int sum=0;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			sum=sum+i;
			
		}
		System.out.println(fact);
		System.out.println(sum);
		
	}
}
