package conditionalstatement;
import java.util.Scanner;
public class DivisibleProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num%3==0 && num%5==0) {
			System.out.println("fizz buzz");
		}
		else if(num%3==0) {
			System.out.println("fizz");
			}
		else if(num%5==0) {
			System.out.println("buzz");
			}
		else {
			System.out.println("invalid");
			}
		sc.close();
		}
	
	}
