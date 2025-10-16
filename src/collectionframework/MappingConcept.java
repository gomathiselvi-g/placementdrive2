package collectionframework;
import java.util.Map;
import java.util.HashMap;
public class MappingConcept {
			public static void main(String[] args) {
				Map<Integer,String> s=new HashMap<>();
				s.put(0,"Gomathi");
				s.put(1,"Jothika");
				s.put(2,"Karpagam");
				s.put(3,"Ganesh");
				s.put(3,"Gomathi");
				s.put(5,"Sieyash");
				s.put(6,"Sieyash");
				s.put(7,"Pappoo");
				s.put(8,"Nila");
				s.put(9,"subash");
				System.err.println("Map");
				System.out.println(s);
				System.err.println("Size");
				System.out.println(s.size());
				System.err.println("get 9th key value");
				System.out.println(s.get(9));
				System.err.println("keyset");
				System.out.println(s.keySet());
				System.err.println("values");
				System.out.println(s.values());
				System.err.println("Entry set");
				System.out.println(s.entrySet());
				System.err.println("check key 9 is present or not");
				System.out.println(s.containsKey(9));
				System.err.println("check value Nila is present or not");
				System.out.println(s.containsValue("Nila"));
				System.err.println("check isempty");
				System.out.println(s.isEmpty());
				System.err.println("remove 3rd key");
				System.out.println(s.remove(3));
				s.clear();
				System.out.println(s);
				
			}

	}


