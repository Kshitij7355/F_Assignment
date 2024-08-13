package Assignment;

import java.util.Scanner;

public class Mummy_motivational_speech {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[][]arr = new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println(Motivation(arr));
		
	}
	public static boolean Motivation(int[][]arr) {
		for(int col=1;col<arr.length;col++) {
			for(int i=0;i<col;i++) {
				if(arr[i][col]!=0) {
					return false;
				}
			}
		}
		return true;
	}

}
