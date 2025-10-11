package basics;/*  
this is a basic program
symbol used for multiline comments*/
public class DataTypes {
	public static void main(String[] args) {
		int num=25;
		float f1=23.5f;
		long l1=99999l;
		byte b=25;
		char ch='1';
		boolean bool=true;
		String str="gomathi";
		System.out.println("output:"+num);
		System.out.println("output:"+f1);
		System.out.println("output:"+l1);
		System.out.println("output:"+b);
		System.out.println("output:"+ch);
		System.out.println("output:"+bool);
		System.out.println("output:"+str);
		System.out.format("%d",num);//we can use "format" to print 
		System.out.printf("output:%c",ch);//we can also use c program
		System.out.print(bool);// the cursor remains in the same line if it is"print"
		System.out.println(num+" "+f1+" "+l1+" ");//to print multiple output
		System.out.println(num+b);//to print multiple output
	}
}
//to print main fn -> main ctrl+space
//to print -> type syso ctrl+space
//to copy and paste -> crtl+alt up arrow/ down arrow 
// to move alt+ up or down