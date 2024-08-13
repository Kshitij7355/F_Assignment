package Assignment;

import java.util.Scanner;

public class Maximum_Sum_path_in_2d {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		while(t-->0) {
			int n =s.nextInt();
			int m=s.nextInt();
			int[]arr=new int[n];
			int[]brr=new int[m];
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			for(int i=0;i<brr.length;i++) {
				brr[i]=s.nextInt();
			}
			Sum(arr,brr);
			
		}
		
	}
	public static void Sum(int[]arr,int[]brr) {
		int i=0;//arr
		int j=0;//brr
		int p=0;//arr start
		int q=0;//brr start
		int ans=0;
		while(i<arr.length && j<brr.length) {
			if(arr[i]<brr[j]) {
				i++;
			}
			else if(arr[i]>brr[j]) {
				j++;
			}
			else {
				int sum1=0;
				int sum2=0;
				for(int k=p;k<=i;k++) {
					sum1+=arr[k];
				}
				for(int k=q;k<=j;k++) {
					sum2+=brr[k];
				}
				ans=ans+Math.max(sum1, sum2);
				i++;
				j++;
				p=i;
				q=j;
			}
		}
//		
		int sum=0;
		int total=0;
		while(p<arr.length) {
			sum+=arr[p];
			p++;
			
		}
		while(q<brr.length) {
			total+=brr[q];
			q++;
		}
		ans=ans+Math.max(sum, total);
		System.out.println(ans);
		
	}

}
