package Assignment;

import java.util.Scanner;

public class next_permutation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
        int n =s.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=s.nextInt();
        }
        Next(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Next(int[]arr) {
		int p=0;
		int q=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		for(int i=arr.length-1;i>p;i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		if(p==0 && q==0) {
			Reverse(arr,0,arr.length-1);
			return;
		}
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		Reverse(arr,p+1,arr.length-1);
	}
	public static void Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
