package collectionframework;
import java.util.ArrayList;
import java.util.Collections;//to sort an array
public class Sort {
		public static void main(String[] args) {
			ArrayList<Integer> a1=new ArrayList<>();
			ArrayList<String> s1=new ArrayList<>();
			a1.add(1);
			a1.add(2);
			a1.add(6);
			a1.add(4);
			a1.add(5);
			System.out.println(a1);
			Collections.sort(a1);
			System.out.println(a1);
			System.out.println(a1.contains(2));
			s1.add("Apple");
			s1.add("Mango");
			s1.add("Grapes");
			s1.add("Orange");
			s1.add("Banana");
			System.out.println(s1);
			Collections.sort(s1);
			System.out.println(s1);
			for(int n:a1) {
				System.out.print(n+" ");
			}
			
			
	}
}


