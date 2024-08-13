package Assignment;

import java.util.Scanner;

public class Playing_with_Good_String {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
        System.out.println(Good(s1));
	}
	public static int Good(String s1) {
		int max=0;
		int curr=0;
		for(int i=0;i<s1.length();i++) {
			char ch =s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				curr++;
				max=Math.max(curr, max);
			}
			else {
				curr=0;
			}
		}
		return max;
	}

}
