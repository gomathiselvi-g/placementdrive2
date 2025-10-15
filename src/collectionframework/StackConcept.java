package collectionframework;

import java.util.Stack;

public class StackConcept {//LIFO
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(43);
		s.push(4);
		s.push(36);
		s.push(24);
		s.push(35);
		s.push(49);
		s.push(42);
		s.push(40);
		s.push(26);
		s.push(3);
		s.push(2);
		System.out.println(s);
		s.pop();//removing last element
		System.out.println(s);
		System.out.println("peek element "+ s.peek());
		System.out.println(s);
		s.add(2,8);//adding is possible in stack
		System.out.println(s);
		System.out.println(s.empty());
		System.out.println(s.size());
		System.out.println(s.capacity());
		System.out.println(s.add(30));//if the add method is given in the print statement it return true or false
		s.clear();
		System.out.println(s);
		
	}
}
