package Assignment;

import java.util.Scanner;

public class Dutch_Nation_Flag {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int[]arr) {
		int lo=0;
		int mid=0;
		int hi=arr.length-1;
		while(mid<=hi) {
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[lo];
				arr[lo]=temp;
				mid++;
				lo++;
			}
			else if(arr[mid]==2) {
				int temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
			      hi--;	
			}
			else {
				mid++;
			}
		}
	}

}
