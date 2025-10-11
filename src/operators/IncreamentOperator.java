package operators;
public class IncreamentOperator {
	public static void main(String[] args) {
		int num=10;
		System.out.println(num++);//10
		System.out.println(num);//11
		int num1=10;
		System.out.println(++num1);//11
		System.out.println(num1);//11
	}
}
//post increment-->++num-->increment and stores the number
//pre increment-->num++--> stores and increment th number