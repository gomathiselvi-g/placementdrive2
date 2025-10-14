package methods;

public class StarProgram {
	void meth(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(" * ");
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		StarProgram st=new StarProgram();
		st.meth(6);
	}
}
