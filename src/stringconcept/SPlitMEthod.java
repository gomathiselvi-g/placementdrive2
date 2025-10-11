package stringconcept;

public class SPlitMEthod {
	public static void main(String[] args) {
		String s1="gomathi is a good leaner";
		String[] arr=s1.split("a");
		for(String c:arr) {
			System.out.println(c);
		}
		System.out.println(arr.length);
	}                                                                                                  
}