package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Sum_Triplet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		Triplet(arr,target);
		
	}
	public static void Triplet(int[]arr,int target) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-2;i++) {
			int j=i+1;
			int k=arr.length-1;
			while(j<k) {
				if(arr[i]+arr[j]+arr[k]==target) {
					System.out.println(arr[i]+","+" "+arr[j]+" "+"and"+" "+arr[k]);
					j++;
					k--;
				}
				else if(arr[i]+arr[j]+arr[k]>target) {
					k--;
				}
				else {
					j++;
				}
			}
		}
	}

}
