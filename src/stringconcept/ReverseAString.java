package stringconcept;

public class ReverseAString {
	public static void main(String[] args) {
		String str="Gomathi is good in java programming";
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			res=res+ch;
	}
		System.out.println(res);
}
}