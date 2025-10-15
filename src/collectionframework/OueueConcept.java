package collectionframework;
import java.util.Queue;
import java.util.LinkedList;
public class OueueConcept {//FIFO
	public static void main(String[] args) {
		Queue<Integer> s=new LinkedList<>();
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
		System.err.println(s);//err means pushing error manually
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
