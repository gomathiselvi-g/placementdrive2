package collectionframework;
import java.util.ArrayList;
import java.util.Iterator;
public class Practice {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(1);
		a.add(10);
		a.add(13);
		a.add(12);
		a.add(18);
		a.add(11);
		a.add(18);
		System.out.println(a);
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		Iterator<Integer> it=a.iterator();
		while(it.hasNext()) {//checks for next data is present in it
			System.out.println(it.next());
		}
	}

}
