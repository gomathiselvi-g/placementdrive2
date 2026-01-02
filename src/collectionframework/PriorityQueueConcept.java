package collectionframework;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;
public class PriorityQueueConcept {
	public static void main(String[] args) {
		//parent class         //child class
		Queue<Character> q=new PriorityQueue<>();// ((a,b) -> a-b)it return in ascending order      
		                                                //manual comparison
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b) -> b-a);
		PriorityQueue<Character> c=new PriorityQueue<>(Comparator.comparingInt((Character x) -> x).reversed());//-->return in descending order
		q.add('x');
		q.add('1');
		q.offer('c'); // insert fn
		q.add('6');
		q.add('h');
		pq.addAll(q);
		c.addAll(q);
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println(q.poll());
        System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
