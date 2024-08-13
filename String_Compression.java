package Assignment;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		Comparison(s1);
		
	}
	public static void Comparison(String s1) {
		char prev=s1.charAt(0);
		int count=1;
		String ans="";
		for(int i=1;i<s1.length();i++) {
			char ch =s1.charAt(i);
			if(prev==ch) {
				count++;
			}
			else {
				ans=ans+prev+count;
				prev=ch;
				count=1;
			}
		}
		ans=ans+s1.charAt(s1.length()-1)+count;
		System.out.println(ans);
	}

}


