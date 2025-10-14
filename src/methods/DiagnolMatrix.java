package methods;

public class DiagnolMatrix {
	boolean diagonal(int arr[][]) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if((row==col && arr[row][col]!=1) ||row!=col && arr[row][col]!=0) {
					return false;
				}
			}
		}
		return true;
	}
    	public static void main(String[] args) {
			int num1[][]= {{1,0,0},{0,1,0},{0,0,1}};
			int num2[][]= {{1,0,0},{0,1,0},{0,0,1}};
			DiagnolMatrix d=new DiagnolMatrix();
			System.out.println(d.diagonal(num1)?"true":"false");
			System.out.println(d.diagonal(num2)?"true":"false");
		}
}
