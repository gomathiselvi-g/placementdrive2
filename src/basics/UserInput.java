package basics;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int num=sc.nextInt();
		System.out.println("value"+num);
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		float f=sc.nextFloat();
		System.out.println(f);
		long l=sc.nextLong();
		System.out.println(l);
		double d=sc.nextDouble();
		System.out.println(d);
		sc.close();
	}

}
//nextLine() this fn used to ge the entire output at the next line
