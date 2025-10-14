package methods;
import java.util.Scanner;
public class EvenOdd {
	boolean evenodd(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		EvenOdd n=new EvenOdd();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(n.evenodd(num));
		sc.close();
	}

}
