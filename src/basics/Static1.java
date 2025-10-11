package basics;
class Another{
	int variable=10;
	static int num=20;
void disp() {
		System.out.println(variable);
	}
static void output() {
	System.out.println(num);
}
public class Static1 {
	public static void main(String[] args) {
		Another an=new Another();
		System.out.println(an.variable);
		System.out.println(Another.num);
		Another.output();
		an.disp();
	}
}
}