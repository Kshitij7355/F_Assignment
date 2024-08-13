package Assignment;

import java.util.Scanner;

public class Arrays_Sprial_Anticlockwise {

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
		Print(arr);

	}
	public static void Print(int[][]arr) {
		int minr=0;
		int maxr=arr.length-1;
		int minc=0;
		int maxc=arr[0].length-1;
		int total_element=arr.length*arr[0].length;
		int count=0;
	     
		while(count<total_element) {
			for(int i=minr;i<=maxr && count<total_element;i++) {
				System.out.print(arr[i][minc]+","+" ");
				count++;
			}
			minc++;
			
			for(int i=minc;i<=maxc && count<total_element;i++) {
				System.out.print(arr[maxr][i]+","+" ");
				count++;
			}
			maxr--;
			
			for(int i=maxr;i>=minr && count<total_element;i--) {
				System.out.print(arr[i][maxc]+","+" ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc && count<total_element;i--) {
				System.out.print(arr[minr][i]+","+" ");
				count++;
			}
			minr++;
		}
		System.out.print("END");
		
	}

}
