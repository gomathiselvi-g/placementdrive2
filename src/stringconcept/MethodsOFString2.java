package stringconcept;

public class MethodsOFString2 {
	public static void main(String[] args) {
		String st1="Gomathi is a excellent programmer";
		System.out.println(st1.substring(13));//substring
		System.out.println(st1.substring(5,19));// to print the string from the particular index
		System.out.println(st1.endsWith("programmer"));// to check the string that end with a given string 
		System.out.println(st1.repeat(3));//repeat the string
		System.out.println(st1);
		System.out.println(st1=st1.repeat(3));//if we assign only it will be changeable other than string is immutable
		System.out.println(st1);//so the string is assigned to st1 
		//replace
		String st2="Gomathi is a excellent programmer";
		System.out.println(st2.replace("programmer","coder"));//replace
		System.out.println(st2.replaceFirst("Gomathi","coder"));
		String st3="Gomathi is a excellent programmer";
		System.out.println(st3.replace("e","*"));//replace
		System.out.println(st3.replaceFirst("e","*"));
		System.out.println(st3.replaceAll("e","*"));
		System.out.println(st3.replaceAll("[aeiou]","*"));
		System.out.println(st3.replaceFirst("[aeiou]","*"));
		System.out.println(st3.replace("[aeiou]","*"));
		System.out.println(st3.replaceAll("[aeiou]", ""));
		//tocharArray
		String s="gomathi";
		char ch[]=s.toCharArray();
		for(char c:ch) {
			System.out.println(c);}
		
		}
}
