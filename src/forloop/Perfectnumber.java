package forloop;
public class Perfectnumber {//if the factors of the number is added and get the same number it will be perfect
	public static void main(String[] args) {
		int num=28;int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==num) {
			System.out.println("the number"+" "+sum+" is perfect");
	}
		else {
			System.out.println("not perfect");
		}
}
}