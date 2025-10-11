package operators;
import java.util.Scanner;
public class TernaryOperator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		String result=((mark>0&&mark<100)?((mark>49)?"pass":"fail"):"invalid");
		System.out.println(result);
		sc.close();
	}
}

