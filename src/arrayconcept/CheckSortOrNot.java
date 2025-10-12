package arrayconcept;
import java.util.Scanner;
public class CheckSortOrNot {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				count++;//System.out.println("unsorted");break;or return;
			}
		}
		//System.out.println("sorted");
		if(count==0) {
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
		sc.close();
   }	
}
 

//another program for sorting
/*		int arr[]={10,20,30,34,45};
 *      for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
		         System.out.println("unsorted");
		         break;or return;
		         }
		        }
 *              syso("sorted")
 *              }
 *              }
 */