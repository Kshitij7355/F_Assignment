package Assignment;

import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int q=s.nextInt();
		while(q-->0) {
			int a=s.nextInt();
			int k =s.nextInt();
			Alex(arr,a,k);
		}
	}
	public static void Alex(int[]arr,int a,int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(a%arr[i]==0) {
				count++;
			}
		}
		if(count<k) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
			
		}
	}
}
