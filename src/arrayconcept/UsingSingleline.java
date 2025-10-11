package arrayconcept;

import java.util.Arrays;

public class UsingSingleline {
	public static void main(String[] args) {
		int arr[]= {24,45,67,78,80};
		int temp=arr[0];
		arr[0]=arr[2];
		arr[2]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
