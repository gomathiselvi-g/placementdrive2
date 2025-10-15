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
				System.out.println(s);
				System.out.println(s.size());
				System.out.println(s.get(9));
				System.out.println(s.containsKey(9));
				System.out.println(s.containsValue("Nila"));
				System.out.println(s.isEmpty());
				System.out.println(s.remove(3));
				s.clear();
				System.out.println(s);
				
			}

	}


