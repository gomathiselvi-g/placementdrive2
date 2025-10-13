package methods;

public class CallbyValue {
void meth(int num) {
	num=10;

}
public static void main(String[] args) {
	CallbyValue e=new CallbyValue();
	int num=5;
	System.out.println(num);
	e.meth(num);
	System.out.println(num);
}
}
