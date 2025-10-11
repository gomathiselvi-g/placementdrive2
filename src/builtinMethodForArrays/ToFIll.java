package builtinMethodForArrays;

import java.util.Arrays;

public class ToFIll {
	public static void main(String[] args) {
		int arr[]=new int[10];
		Arrays.fill(arr,5);
		System.out.println(Arrays.toString(arr));
		int dest[]=Arrays.copyOf(arr, 3);//copy the same values in arrays upto 3
		System.out.println(Arrays.toString(dest));
		
	}

}
