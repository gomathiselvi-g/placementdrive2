package collectionframework;
import java.util.Map;
import java.util.LinkedHashMap;
public class HashMapIteration {
public static void main(String[] args) {
	LinkedHashMap<Character,Integer> p=new LinkedHashMap<>();
	p.put('v', 1);
	p.put('e', 1);
	p.put('l', 0);
	p.put('a', 9);
	p.put('r', 1);
	for(char ch:p.keySet()) {//after printing the character it again go and search and taken and then print the value
		System.out.println(ch+" : "+p.get(ch));
	}
	System.out.println("------------------");
	for(int i:p.values()) {
		System.out.println(i);
	}
	System.out.println("--------------------------");
	//it return both the key and value without searching again
	for(Map.Entry<Character,Integer> it : p.entrySet()) {
		System.out.println(it.getKey()+" : "+it.getValue());
	}
	
	
}
}
