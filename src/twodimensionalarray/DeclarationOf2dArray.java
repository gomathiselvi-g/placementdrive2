package twodimensionalarray;
import java.util.Arrays;

public class DeclarationOf2dArray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{4,5,6},{7,8,9}};
		
		System.out.println(arr.length);//length of an array -->row size
		System.out.println(arr[0].length);//length of an array -->column size
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int arr1[][]=new int[3][3];//it print 0
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

