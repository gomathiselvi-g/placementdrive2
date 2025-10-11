package builtinMethodForArrays;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int c[]= {1,2,3,4,5};
		int d[]=new int[10];          
		                 //source,2nd index value,destination,5th index position,arraylength 2 position -
		System.arraycopy(    c    ,    2,              d,           5,               c.length-2);
		System.out.println(Arrays.toString(d));
		
	}
}
/*destination is 5th pace,
 *  so place the 2nd index value that is (3) 
 *  so place the 3 in the 5th position
 *  length is -2 so on the 10 size of ARRAY length will be 10-2=8
 */
 // 0,1,2,3,4,5,6,7,8,9
 //[0,0,0,0,0,3,4,5,0,0]