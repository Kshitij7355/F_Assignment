package Assignment;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int q=s.nextInt();
		while(q-->0) {
			int[]brr=new int[n];
			int x = s.nextInt();
			for(int i=0;i<arr.length;i++) {
				int z=i-x;
				if(z<0) {
					z=z+n;
				}
				brr[i]=arr[i]+arr[z];
			}
			arr=brr;
		}
	
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int ans=sum%1000000007;
		System.out.println(ans);

	}

}
