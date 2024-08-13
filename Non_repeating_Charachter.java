package Assignment;

import java.util.Scanner;

public class Non_repeating_Charachter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			String s1 = s.next();
			char cha=Charachter(s1);
			if(cha=='0') {
				System.out.println("-1");
			}
			else {
				System.out.println(cha);
			}
		}
	}
	public static char Charachter(String s1) {
		int[]freq=new int[26];
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			freq[ch-97]=freq[ch-97]+1;
		}
		char ans='0';
		for(int i=0;i<s1.length();i++) {
			char cha=s1.charAt(i);
			if(freq[cha-97]==1) {
				 ans=(char)(97+(cha-97));
	             return ans;
			}
		}
		return ans;
	}

}
