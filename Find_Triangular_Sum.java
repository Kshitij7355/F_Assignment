package Assignment;

import java.util.Scanner;

public class Find_Triangular_Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int[]arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Sum(arr));

	}
	public static int Sum(int[]arr) {
		int sum=0;
		if(arr.length==1) {
			sum+=arr[0]%10;
			return sum;
		}
		for(int i=0;i<arr.length;i++) {
			int[]brr=new int[arr.length-1];
			for(int j=0;j<arr.length-1;j++) {
				brr[j]=(arr[j]+arr[j+1])%10;
			}
			arr=brr;
		}
		
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}

}
