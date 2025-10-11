package whileloop;

public class ArmStrongBwRange {
	public static void main(String[] args) {
			int num;
			for(num=1;num<=10000;num++) {
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
			if(sum==temp) {
			System.out.println(sum);
			}
			num=temp;
	}
}

}

