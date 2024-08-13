package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_parantha {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int nop=s.nextInt();
		int noc=s.nextInt();
		int[]arr = new int[noc];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Paratha(arr,nop,noc));

	}
	public static int Paratha(int[]arr,int nop,int noc) {
		
		int lo=0;
		int hi=0;
		int ans=0;
		hi=(arr[arr.length-1]*(nop*(nop+1)))/2;
		hi=hi/2;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(IsitPossible(arr,nop,mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
		
	}
	public static boolean IsitPossible(int[]arr,int nop, int mid) {
		int pi=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			int cn=1;
			while(sum+cn*arr[i]<=mid) {
				sum+=cn*arr[i];
				cn++;
				pi++;
			}
			if(pi>=nop) {
				return true;
			}
		}
		return false;
	}

}
