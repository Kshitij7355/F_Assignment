package Assignment;

import java.util.Scanner;

public class String_Remove_Duplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		Remove(s1);

	}
	public static void Remove(String s1) {
	      char prev = s1.charAt(0);
	      String ans="";
	      for(int i=1;i<s1.length();i++) {
	    	  char ch = s1.charAt(i);
	    	  if(ch==prev) {
	    		  
	    	  }
	    	  else {
	    		  ans=ans+prev;
	    		  prev=ch;
	    		  
	    	  }
	      }
	      ans=ans+prev;
	      System.out.println(ans);
	    		  
	}

}
