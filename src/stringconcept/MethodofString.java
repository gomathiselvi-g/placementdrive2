package stringconcept;

public class MethodofString {
	public static void main(String[] args) {
		String st="Hello";
		String st2="hello";
		System.out.println(st.equals(st2));//checks both string are equals
		System.out.println(st.equalsIgnoreCase(st2));//don't check the string were equals
		System.out.println(st.length());//print length	
		System.out.println(st==st2);//check address
		System.out.println(st.compareTo(st2));//check Ascii difference between every character
		String str1="h";
		String str2="hello";
		System.out.println(str1.compareTo(str2));//check Ascii difference between every character if everything same then it will return the length
		String s1="Hello";
		String s2="hello hi";
		System.out.println(s1.compareToIgnoreCase(s2));//they dont check ascii it will check length
		String str3="i love java";
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		System.out.println((str3));
		System.out.println((str3.charAt(4)));//print the char in that string
		String str4="   hi  ";
		System.out.println(str4);
		System.out.println(str4.trim());//use to remove space at start and at end
		System.out.println(str3.indexOf('i'));//it return the index position of the given character
		System.out.println(str3.indexOf("i"));
		System.out.println(str3.indexOf("lo"));//starting position will be print
		System.out.println(str3.indexOf("you"));//to check the string is present or not
		System.out.println(str3.lastIndexOf("a"));//prints the last element position
		System.out.println(str3.indexOf("a"));
		System.out.println(str3.indexOf("a",9));//returns the position of a after 8th index
		//System.out.println(str3.indexOf("a",7,10)); it returns the a from 7th position to 10th position that is present inthe string
		System.out.println(str3.contains("java"));//returns true or false it the string is present
		System.out.println(str3.contains("you"));
		
		
}
}