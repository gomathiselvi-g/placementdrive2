package collectionframework;

import java.util.Vector;
public class VectorConcept {
	public static void main(String[] args) {
		Vector<Integer> s=new Vector<>();//we can change this size(15,2)
		s.add(43);
		s.add(4);
		s.add(36);
		s.add(24);
		s.add(35);
		s.add(49);
		s.add(42);
		s.add(40);
		s.add(26);
		s.add(3);
		s.add(2);
		System.out.println(s);
		//.pop();//removing last element
		System.out.println(s);
		//.out.println("peek element "+ s.peek());
		//System.out.println(s);
		s.add(2,8);//adding is possible in stack
		System.out.println(s);
		//System.out.println(s.empty());
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s.add(30));//if the add method is given in the print statement it return true or false
		s.clear();
		System.out.println(s);
		
	}
}
