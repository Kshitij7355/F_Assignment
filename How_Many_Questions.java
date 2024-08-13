package Assignment;

import java.util.Scanner;

public class How_Many_Questions {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int cn=0;
		while(t-->0) {
			int[]arr=new int[3];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.nextInt();
			}
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==1) {
					count++;
				}
			}
			if(count>0 && count>=2) {
				cn++;
			}
		}
		System.out.println(cn);

	}

}
