package arrayconcept;

public class MInimumOfArray {
public static void main(String[] args) {
	int arr[]= {10,20,30,40,50,60};
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[0]) {
			min=arr[0];
		}
	}
	System.out.println(min);
}
}
