package operators;
public class LogicalOperator {//only perform inbetween the true and false
	public static void main(String[] args) {
		int num=10;
		System.out.println(!(++num>10)||++num<12);
		System.out.println(num);
	}
}

