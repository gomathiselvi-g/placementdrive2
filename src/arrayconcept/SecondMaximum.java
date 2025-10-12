package arrayconcept;


public class SecondMaximum {
	public static void main(String[] args) {
	    int arr[]= {10,12,13,14,11,29};
		int max=arr[0];
		int smax=0;//second max
		int tmax=0;//third max
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				tmax=smax;
				smax=max;
				max=arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(smax);
		System.out.println(tmax);
	}
}
