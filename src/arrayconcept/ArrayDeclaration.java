package arrayconcept;

public class ArrayDeclaration {
	public static void main(String[] args) {
		String arr[]= {"kavin","Harish","kabilan","salman"};//i cant resize the array
		System.out.println(arr[3]);//pointing the data
		arr[3]="Gomathi";
		System.out.println(arr[3]);
		int num[]= {1,2,3,4,5};//int
		System.out.println(num[3]);
		num[2]=num[2];
		System.out.println(num[2]);
		num[1]=num[4];
		System.out.println(num[1]);
		float num1[]= {1,2,3,4,5};//float
		System.out.println(num1[3]);
		System.out.println(arr);//if we call only array name it will return address
		System.out.println(num);
		System.out.println(num1);
		char ch[]= {'a','b','A','B'};//char
		System.out.println((int)ch[0]);
		boolean bool[]= {true,false};//boolean
		System.out.println(bool[0]);
		}
		
	}
