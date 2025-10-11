package whileloop;

public class ArmStrongNUmber {
	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int last=num%10;
			sum=sum+(last*last*last);
			num/=10;
			
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("yes");}
		else {
			System.out.println("no");
			
		}
		
	}
}
