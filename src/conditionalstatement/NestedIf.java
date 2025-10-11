package conditionalstatement;
import java.util.Scanner;
public class NestedIf {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter num");
			int num=sc.nextInt();
			if(num>0) {
				if(num%2==0) {
					System.out.println("it is positive and even number");
				}
				else {
					System.out.println("it is positive and odd");
				}
			}
			else {
					System.out.println("it is negative number");
				}
			    sc.close();
			}
			
			
		}








