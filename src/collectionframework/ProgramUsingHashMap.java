package collectionframework;
import java.util.Scanner;
import java.util.HashMap;
//import java.util.Map;
//import java.util.LinkedHashMap;
//import java.util.Collections;
public class ProgramUsingHashMap {
		public static void main(String[] args) {
			System.out.println("enter the string");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			HashMap<Character,Integer> a=new HashMap<>();
			for(char ch:s.toCharArray()) {
				if(a.containsKey(ch)) {
					a.put(ch, a.get(ch)+1);
				}
				else {
					a.put(ch, 1);
				}
				sc.close();
			}
			System.out.println(a);
		    /*Integer m =Collections.max(a.values()) ;
		    System.out.println(a.getKey()+":" +m);
		    	*/
			
			int max=0;
			char chr='\0';
			for(char c:a.keySet()) {
				int cval=a.get(c);
				if(cval>max) {
					max=cval;
					chr=c;
				}
			}
			System.out.println(chr);
			
		            }
		        
		    }


	