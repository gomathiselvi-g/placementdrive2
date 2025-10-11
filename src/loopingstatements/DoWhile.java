package loopingstatements;

public class DoWhile {
	public static void main(String[] args) {
		int num=1;//atleast once the loop will be executed
		do {
			System.out.println(num);
			num++;
		}while(num<1);
		System.out.println("end");
	}
}
