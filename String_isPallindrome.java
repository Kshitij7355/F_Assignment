package Assignment;

import java.util.Scanner;

public class String_isPallindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		System.out.println(Pallindrome(s1));
		
	}
	public static boolean Pallindrome(String s1) {
		int i=0;
		int j=s1.length()-1;
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
