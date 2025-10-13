//it will execute when the user get called
package methods;
import java.util.Scanner;
public class IntroductionOfMethods {
	Scanner sc=new Scanner(System.in);
//without return type without parameter
			void gomathi() {  
				int a=sc.nextInt();
				int b=sc.nextInt();    //method declaration or definition part
				int res=a+b;
				System.out.println(res);

			}
//with return type without parameter
			float sieyash() {
				int a=sc.nextInt();
				int b=sc.nextInt();    //method declaration or definition part
				return a*b;   //used to go back to the method called path
			}
//without return type with parameter
			void nila(int a,int b) {
				if (a<b) {
					System.out.println("input 1 is lesser than input 2");
					return;//if void-->float it will return some value
				}
				System.out.println(a-b);
			}
//with return type with parameter
			String concatination(String s1,String s2) {
				return s1+s2;
			}
//another example
			int nilan(int a ,int  b) {
				int res=a*b;
				return res;
			}
			public static void main(String[] args) {
				IntroductionOfMethods ob=new IntroductionOfMethods();
				System.out.println("method calling 1");
				ob.gomathi();//method calling
				float res=ob.sieyash();
				System.out.println(res);//2nd method calling
				ob.nila(10,30);//3rd method calling
				ob.nila(20,10);
				System.out.println(ob.concatination("Gomathi","selvi")); //4th method calling
				System.out.println(ob.nilan(20,1));
				System.out.println(ob.nilan(20,2));
			}
		}

