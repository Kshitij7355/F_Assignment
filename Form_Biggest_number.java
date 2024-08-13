package Assignment;

import java.util.Scanner;

public class Form_Biggest_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			int n =s.nextInt();
			int[]arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.nextInt();
			}
			Sort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
			}
		}

	}
	public static String Sort(int[]arr) {
		String ans="";
		for(int turn=1 ;turn <arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {
				if(compare(arr[i],arr[i+1])>0) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
		
		
	}
	public static int compare(int x1, int x2) {
		 String s1 = ""+x1+x2;
		 String s2 = ""+x2+x1;
		 if(Long.parseLong(s2)>Long.parseLong(s1)) {
			 return 1;
		 }
		 else {
			 return -1;
		 }
	}

}
