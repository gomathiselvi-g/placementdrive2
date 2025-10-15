package collectionframework;
import java.util.Scanner;
import java.util.ArrayList;
public class Integerconcept {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		ArrayList<Integer> b=new ArrayList<>();
		for(int i=0;i<a;i++) {
			Integer c=sc.nextInt();
			b.add(c);
		}
		System.out.println(b);
		sc.close();
	}

}
