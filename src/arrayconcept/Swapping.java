package arrayconcept;
public class Swapping {
	public static void main(String[] args) {
		int arr[]= {24,45,67,78,80};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
	for(int i=0;i<arr.length;i++) {
		System.out.println(i+":"+arr[i]);
	}
	System.out.println("for eac loop");
	for(int n:arr) {
		System.out.println(n);
	}
	}
	
}
