package stringconcept;

public class DeclaringOfString {
	public static void main(String[] args) {
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello";
		String str4=new String("Hello");
		char ch[]= {'h','e','l','l','o'};
		String str5=new String(ch);//
		System.out.println(str5);
		
		System.out.println(str1==str2);//checks the memory
		System.out.println(str1==str3);
		System.out.println(str2==str4);
		System.out.println(str1.equals(str2));//checks the charac seqence is equal
	}
}
