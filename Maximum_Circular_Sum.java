package Assignment;

import java.util.Scanner;

public class Maximum_Circular_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Sum(arr));

	}
	public static int Sum(int[]arr) {
		int linear=Kadens(arr);
		int sum=0;
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			arr[i]=arr[i]*-1;
		}
		int circular=Ckadens(arr);
		int circular_Total=circular+sum;
		if(circular_Total==0) {
		ans=Math.min(linear, circular_Total);
		}
		else {
		 ans=Math.max(linear, circular_Total);
		}
		
		return ans;
	}
	private static int Ckadens(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}
	public static int Kadens(int[] arr) {
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
	}

}
