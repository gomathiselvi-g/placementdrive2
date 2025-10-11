package operators;
public class Arithmeticoperators {
	public static void main(String[] args) {
		// /operator
		System.out.println(8/2);
		//%
		System.out.println(8%2);
		int num=2/5;
		System.out.println(num);
		float num1=7/2f;
		System.out.println(num1);
		System.out.println(7f/2);
		System.out.println(285945%10000);
		System.out.println(2859/100);
		//separate the number and add that number
		int num3=25;
		System.out.println((num3%10)+(25/10));
		int num4=26;
		int quo=num4/10;
		int rem=num4%10;
		int result=rem*10;
		System.out.println(result+quo);	
		System.out.println(rem+""+quo);	
	}
}
