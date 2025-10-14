package collectionframework;

public class WrapperClass {
	public static void main(String[] args) {
		//auto boxing-->prim to non prim
		int num=1032;
		Integer i=Integer.valueOf(num);
		Integer n=num;
		System.out.println(n);
		//un boxing
		Integer no=2345;
		int op=no.intValue();
		int o=no;
		System.out.println(op);
		System.out.println(o);
		//non prim to non prim
		//int to string
		Integer no1=2345;
		String st=String.valueOf(no1);
		 // string to integer
		String str="12345";
		Integer res=Integer.parseInt(st);//non prim ->non prim
		System.out.println(str);
		System.out.println(res);
		StringBuffer sb=new StringBuffer();
		sb.append(st);
		System.out.println(sb.reverse());
		sb.append(3);
		System.out.println(sb);
		st=sb.toString();
		//Integer res=Integer.parseInt(st);//non prim ->non prim
		System.out.println(res);
		//Integer i=Integer.valueOf(num);
		System.out.println(i);
		float f=32.9f;
		Float ft=Float.valueOf(f);
		System.out.println(ft);
		
	}
}
