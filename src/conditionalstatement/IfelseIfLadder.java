package conditionalstatement;
import java.util.Scanner;

public class IfelseIfLadder { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		if(marks>=100) {
			System.out.println("Grade O");
		}
		
		else if(marks>=80 && marks<=99){
			System.out.println("Grade A");
		}
		else if(marks>=60 &&  marks<=79){
			System.out.println("Grade B");
		}
		else if(marks>40 && marks<=59){
			System.out.println("Grade C");
		}
		else {
			System.out.println("fail");
		}
		sc.close();
	}
}
