package collectionframework;

import java.util.ArrayList;

public class ArrayListMethod {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		System.out.println("print the array");
		System.out.println(a1);
		//to get the size of the array
		System.out.println("print the size");
		System.out.println(a1.size());
		//to retrieve data from the particular index
		System.out.println("print the get value in 3rd index");
		System.out.println(a1.get(3));
		a1.toArray();
		//to replace the value to index
		System.out.println("print the set the 2nd index value to 10");
		a1.set(2,10);
		System.out.println(a1);
		///remove the value from the index
		System.out.println("print the remove index of 3");
		a1.remove(3);
		//to check  whether the element is present or not
		System.out.println("print the contains value of 3");
		System.out.println(a1.contains(3));
		////to check whether my arraylist  contains data ornot
		System.out.println("print the array is empty");
		System.out.println(a1.isEmpty());
		//to clear the array
		System.out.println("print the array is cleared");
		a1.clear();
		System.out.println(a1);
	}
}
