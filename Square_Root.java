package Assignment;

import java.util.Scanner;

public class Square_Root {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a =s.nextLong();
		long lo=1;
		long ans=0;
		long hi=a/2;
		while(lo<=hi) {
			long mid=(lo+(hi-lo)/2);
			if(mid*mid<=a) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		System.out.println(ans);

	}

}
