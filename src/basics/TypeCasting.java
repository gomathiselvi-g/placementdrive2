package basics;
public class TypeCasting {
	public static void main(String[] args) {
		//implicit
		char ch=' ';//A,B,C,1,2,0,a,b we can use any value 
		int i=(int)ch;
		int j=ch;
		System.out.println(i);
		System.out.println(j);
		//explicit
		float fl=22.5f;
		int in=(int)fl;
		System.out.println(in);	
				}
}
