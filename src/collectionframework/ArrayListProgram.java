package collectionframework;
//import java.util.List;
import java.util.ArrayList;
public class ArrayListProgram {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		a1.set(2,10);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		for(int i:a1) {
			System.out.print(i);
		}
	}
	}

