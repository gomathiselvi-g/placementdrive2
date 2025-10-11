package arrayconcept;

import java.util.Scanner;

public class UsingScannerAndLoop {
public static void main(String[] args) {
	String arr[]= {"kavin","kabilan","Harish","salman","maideen"};
	System.out.println(arr[2]);
	Scanner sc= new Scanner(System.in);
	int[] num=new int[5];
	num[0]=sc.nextInt();
	for(int i=1;i<num.length;i++) {
		num[i]=sc.nextInt();
	}
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	sc.close();
}
}
