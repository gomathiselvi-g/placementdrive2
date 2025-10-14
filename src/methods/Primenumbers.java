package methods;

import java.util.Scanner;

public class Primenumbers {
	boolean meth(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Primenumbers p=new Primenumbers();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(p.meth(num));
		sc.close();
	}
}
