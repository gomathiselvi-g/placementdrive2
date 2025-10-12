package twodimensionalarray;
//same matrix program like 3X3 matrix
public class SumOfColumn {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int j=0;j<arr[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i][j];
	  }
		System.out.println(sum);
	}
	}
}
/*
int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<arr[0].length;i++) {
	int sum=0;
        for(int j=0;j<arr.length;j++) {
			sum+=arr[j][i];
		}
		System.out.println(sum);
}*/