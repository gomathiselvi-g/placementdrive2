package collectionframework;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        // Step 1: Get input from user
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        // Step 2: Conditions
        if (arr.isEmpty()) {
            System.out.println("Array is empty. Enter 4 elements:");
            for (int i = 0; i < 4; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println("Array after adding 4 elements: " + arr);
        } 
        else if (arr.size() % 2 == 0) {
            int newSize = arr.size() * 2;
            System.out.println("Array size is even. Enter " + (newSize-arr.size()) + " more elements:");
            for (int i = arr.size(); i < newSize; i++) {
                arr.add(sc.nextInt());
            }
            System.out.println("Array after doubling: " + arr);
        } 
        else {
            System.out.println("Array size is odd. Final array: " + arr);
        }

        sc.close();
    }
}
/*package collectionframework;
import java.util.Scanner;
import java.util.ArrayList;
public class Program {
	public static void main(String[] args) {
		ArrayList <Integer> arr=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println(arr.size());
			int b=arr.size();
			if(arr.isEmpty()) {
				for(int i=b;i<4;i++) {
					Integer s=sc.nextInt();
					arr.add(s);
					
				}
				System.out.println(arr);
			}
			else if(b%2==0) {
				int c=b*2;
				for(int i=b;i<c;i++) {
					int s=sc.nextInt();
					arr.add(s);		
					}
			System.out.println(arr);
			}
			else {
				System.out.println(arr);
			}
			
		   sc.close();
		}		
	}

*/