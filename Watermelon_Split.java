package Assignment;

import java.util.Scanner;

public class Watermelon_Split {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int x = n/2;
		int y = n-x;
		if(x%2==0 && y%2==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}

	}

}
