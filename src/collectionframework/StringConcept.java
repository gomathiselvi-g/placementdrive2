package collectionframework;
import java.util.ArrayList;
import java.util.Scanner;
public class StringConcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<=a;i++) {
			String s1=sc.next();
			arr.add(s1);
	
		}
		System.out.println(arr);
		sc.close();
	}
}
