package collectionframework;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class DequeueConcept {
	public static void main(String[] args) {
		Queue<Integer> s=new ArrayDeque<>();
		Deque<Integer> s1=new LinkedList<>();
		Deque<Integer> s2=new ArrayDeque<>();
		s.offer(43);
		s.offer(4);
		s.offer(36);
		s.offer(32);
		s.offer(3);
		s.offer(12);
		System.err.println(s);
		s1.offer(1);
		s1.offer(2);
		s1.offer(3);
		s1.offer(4);
		System.err.println(s1);
		s2.offer(4);
		s2.offer(4);
		s2.offer(4);
		s2.offer(4);
		s2.offer(4);
		System.err.println(s1);
		s2.offerFirst(2);
		System.out.println(s2);
		s1.offerFirst(2);
		System.out.println(s1);
		s.offer(2);
		s.offer(6);
		s.poll();//removing the first element
		System.out.println(s);
		System.err.println("peek element "+ s.peek());
		System.out.println(s);
		s.add(2);//adding is possible in stack
		System.err.println(s);
		System.out.println(s.isEmpty());
		System.err.println(s.size());
		System.out.println(s.add(30));//if the add method is given in the print statement it return true or false
		s.clear();
		System.out.println(s);
		System.out.println(s.peek());
		
	}
}
