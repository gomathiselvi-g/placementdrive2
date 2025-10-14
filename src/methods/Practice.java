package methods;
public class Practice {
		Practice meth(Practice o) {
		System.out.println(o);
			System.out.println("What will be the return type of this meth");
			Practice p=new Practice();
			System.out.println(p);
			return p;
		}
		public static void main(String [] vcet) {
			Practice v=new Practice();
			System.out.println(v);
			Practice r=v.meth(v);
			System.out.println(r);
		}
	}
//v,o address is same
//p,r address is same