package basics;
public class Variables {  //VARIABLE MEANS IT IS USED To REFER MEMORY ADDRESS
		int insvar=50;//instance variable-outside the class
		//int insvar; the dafault value will be asigned for global variable
	void meth() {
		int locvar=23;
		//int locvar; if any value is not assigned it will cause error for local variable
		System.out.println(locvar);//loc var only used in the particular segment,
		System.out.println(insvar);
	}
	void disp() {
		int locvar=25;
		System.out.println(locvar);
		System.out.println(insvar);
	    //System.out.println(locvar); this line will be not executed here,bcoz it is in the outside of the method
	}
	
	public static void main(String[] args) {
		Variables s1=new Variables();
		//Variables s2=new Variables();
		System.out.println(s1);//print the memory address of s1
		s1.meth();//s2.meth()
		s1.disp();//
		/* another method
		   Variables obj;
		   obj= new Variables;//memory allocation
		 */
  }
}
//the adress of locvar in meth() and disp() are different
