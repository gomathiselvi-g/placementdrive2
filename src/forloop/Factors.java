package forloop;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int count=0;//counting the factors
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;//counting the factors
			}
		}
		System.out.println("count"+count);//counting the factors
		sc.close();
	}
}
