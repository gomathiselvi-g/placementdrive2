package basics;
public class Mathematical {
	public static void main(String[] args) {
		System.out.println(Math.pow(2,31));//static method-> calling the method by math fuction
		System.out.println((int)Math.pow(2,31));//without exponent at the end using int
		System.out.println(Math.ceil(2.7));//high
		System.out.println(Math.ceil(2.3));//high
		System.out.println(Math.floor(2.7));//low
		System.out.println(Math.floor(2.3));//low
		System.out.println(Math.round(2.7));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.max(23,24));
		System.out.println(Math.min(23,24));
		System.out.println(Math.abs(-23));
		System.out.println(Math.abs(23));	
	}
}
