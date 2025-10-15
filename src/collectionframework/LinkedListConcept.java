package collectionframework;
import java.util.LinkedList;
public class LinkedListConcept {   //insertion and deletion will only fast in linked list
		public static void main(String[] args) {
			LinkedList<Integer> l=new LinkedList<>();
			l.add(1);
			l.add(2);
			l.add(3);
			l.add(2);
			l.add(4);
			l.add(8);
			l.add(6);
			l.add(5);
			l.add(6);
			System.out.println("Array");
			System.out.println(l);
			System.out.println(" add 6 to first index in anArray");
			l.addFirst(6);
			System.out.println(l);
			System.out.println("Size of an array  "+l.size());
			l.add(3,8);
			System.out.println(l);
			System.out.println("to get index 1 vaue = "+l.get(1));
			System.out.println("remove the elements");
			l.remove();
			System.out.println(l);
			System.out.println("remove the last elements");
			l.removeLast();
			System.out.println(l);
			System.out.println("remove 3 rd index in array");
			l.remove(3);
			System.out.println(3);
			System.out.println("remove first occurence of 2");
			l.removeFirstOccurrence(2);
			System.out.println(l);
			System.out.println("remove last occurence of 6");
			l.removeLastOccurrence(6);
			System.out.println(l);
			System.out.println("is emptyyyy");
			System.out.println(l.isEmpty());
			System.out.println(l);
			System.out.println("Index of the element");
			System.out.println(l.indexOf(4));
			
			
		}

}
