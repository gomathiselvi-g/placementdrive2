package basics;
public class StaticvariableExample {
		int num=1;  //instance
		static int num1=1;  //static refers unique memory for entire class
		void disp() {
			num1++;
			num++;
			System.out.println("Ins " +num);
			System.out.println("Static "+num1);
		}
		public static void main(String[] args) {
			StaticvariableExample s1=new StaticvariableExample();
			StaticvariableExample s2=new StaticvariableExample();
			StaticvariableExample s3=new StaticvariableExample();
			s1.disp();
			s2.disp();
			s3.disp();
		}
	}
