package Assignment;

import java.util.Scanner;

public class Rowwise_Sort_Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m =s.nextInt();
		int[][]arr = new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void Sort(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				int picked=arr[i][j];
				int k=j-1;
				while(k>=0 && arr[i][k]>picked) {
					arr[i][k+1]=arr[i][k];
					k--;
				}
				arr[i][k+1]=picked;
			}
		}
	}

}
