package methods;

public class AnotherPrime {
	String isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return "it is not prime";
			}
			
		}
		return "it is prime";
	}
	public static void main(String[] args) {
		AnotherPrime p=new AnotherPrime();
		System.out.println(p.isPrime(4));
		//conditional operator another method
		//System.out.println(p.isPrime()?"yes":"no");
	}

}
