package arrayconcept;

public class AnotherwaySecondLargest {
	public static void main(String[] args) {
		int[] arr= {12,34,37,37,2,36};
		int max=arr[0];
		int smax=arr[1];
		if(arr[0]>arr[1]){
			max=arr[0];
			smax=arr[1];
		}
		else {
			max=arr[1];
			smax=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max) {
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax&& arr[i]!=max) {
				smax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
	}
		
}

