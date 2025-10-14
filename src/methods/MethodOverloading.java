package methods;
// where multiple methods in the same class share the same name
//but have different parameters. 
/*
//ambiguity exception means--> 1)it will go for the exact match
                             2)if the compiler got exact match of two methods      
                             3)it goes for implicit match eg:(int n1,float n2)-->
                                                              (float n1,int n2)
                                                              pass(2.0f,2)
                                                              then compiler shows error
                             4)then it is called implicit match
*/
public class MethodOverloading {
	void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
		mo.sum(2, 8.0f);
	    mo.sum(2,5,6);
	    mo.sum(3, 6);
		
	}
}
