package problems;

import java.util.Scanner;

public class lenlexicaps {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        int alen=A.length();
	        int blen=B.length();
	        int add=alen+blen;	        	        
	        System.out.println(add);
	        int achar=A.charAt(0);
	        int bchar=B.charAt(0); 
	        if(achar>=bchar) {
	        	 System.out.println("YES");
	        }
	        else {
	        	 System.out.println("No");
	        }
	        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
	}

}
