package Assignment;

import java.util.Scanner;

public class Rotate_Image {

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int n =s.nextInt();
	   int[][]arr = new int[n][n];
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[0].length;j++) {
			   arr[i][j]=s.nextInt();
		   }
	   }
	   Rotate(arr);
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr[0].length;j++) {
			   System.out.print(arr[i][j]+" ");
		   }
		   System.out.println();
	   }

	}
	public static void Rotate(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		 }
		for(int row=0;row<arr.length;row++) {
			int i =0;
			int j =arr.length-1;
			while(i<j) {
				int temp =arr[row][i];
				arr[row][i]=arr[row][j];
				arr[row][j]=temp;
				i++;
				j--;
				
			}
		}
		
		
	}

}
