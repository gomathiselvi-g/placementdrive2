package twodimensionalarray;
import java.util.Scanner;

public class UsingScanner {
	public static void main(String[] args) {
		int arr1[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data:");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		sc.close();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
	}
	
	}
}
