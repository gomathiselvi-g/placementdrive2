package forloop;
import java.util.Scanner;
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the primenumber");
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
		}
			if(count==2) {//if the count is 2 then it will be a prime number
				System.out.println("this is a prime");
		}
			else {
				System.out.println("not prime");
			}
			sc.close();
	}
}
