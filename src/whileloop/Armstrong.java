package whileloop;

public class Armstrong {
	public static void main(String[] args) {
			int num=153;
			int temp=num;
			int len=0;
			while(num!=0) {
				num/=10;
				len++;//condition to count the length of the number
			}
			num=temp;
			int sum=0;
			while(num!=0) {
				int last=num%10;
				int pow=1;
				for(int i=1;i<=len;i++) {
					pow=pow*last;
				}
				sum+=pow;
				num/=10;
				}
			System.out.println(sum);
			if(temp==sum) {
			System.out.println("armstrong");
			}
			else {
				System.out.println("not armstrong");
			}
	}
}

