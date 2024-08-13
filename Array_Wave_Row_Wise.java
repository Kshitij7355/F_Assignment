package Assignment;

import java.util.Scanner;

public class Array_Wave_Row_Wise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m = s.nextInt();
		int[][]arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		Print(arr);

	}
	public static void Print(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+","+" ");
				}
			}
			else {
				for(int j=arr[0].length-1;j>=0;j--) {
					System.out.print(arr[i][j]+","+" ");
				}
			}
			
		}
		System.out.print("END");
	}

}
