package operators;
public class BitwiseOperator {
	public static void main(String[] args) {
		System.out.println(12&10);//bitwise and
		System.out.println(12|10);//bitwise or
		System.out.println(12^10);//bitwise xor
		System.out.println(12>>10);//bitwise right
		System.out.println(5<<3);//bitwise left
		System.out.println(-32>>4);//(formula:num/2^shiftingtime)
		System.out.println(-32<<4);//(f:num*2^st)
		System.out.println(-24>>3);
		System.out.println(12>>>10);
		System.out.println(12^10^12);
		System.out.println(~10);//bitwise complement(+1,change the sign)
		System.out.println(~-10);
	}
}
