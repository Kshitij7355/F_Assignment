package Assignment;

import java.util.Scanner;

public class Can_you_read_This {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String ans="";
		ans+=s1.charAt(0);
		for(int i=1;i<s1.length();i++) {
			char ch = s1.charAt(i);
			if(ch>='A' && ch<='Z') {
				System.out.println(ans);
				ans="";
				ans+=ch;
			}
			else {
				ans+=ch;
			}
		}
		System.out.println(ans);
		

	}

}
