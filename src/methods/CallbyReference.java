package methods;
//call by reference
public class CallbyReference {
	void meth(int num) {
		num=10;
	}
	void hi(int arr[]) {
		arr[0]=25;
		System.out.println(arr);
	}
	public static void main(String[] args) {
		CallbyReference e=new CallbyReference();
		int num=5;
		System.out.println(num);
		e.meth(num);
		System.out.println(num);
		int arr[]= {1,2};
		System.out.println(arr[0]);
		e.hi(arr);
		System.out.println(arr[0]);
		
	}
}
