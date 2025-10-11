package basics;
public class Objects {
		int insvar=25;
	public static void main(String[] args) {
		Objects s1=new Objects();
		Objects s2=new Objects();
		System.out.println(s1.insvar);
		System.out.println(s2.insvar);
		s1.insvar=50;
		System.out.println(s1.insvar);
		System.out.println(s2.insvar);
	}
}	