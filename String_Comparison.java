package Assignment;

import java.util.Scanner;

public class String_Comparison {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1=s.next();
		Comparison(s1);
		
	}
	public static void Comparison(String s1) {
		char ch=s1.charAt(0);
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==ch) {
				count++;
			}
			else {
				System.out.print(ch+""+count);
				ch=s1.charAt(i);
				count=1;
			}
		}
		System.out.print(ch+""+count);
	}

}
