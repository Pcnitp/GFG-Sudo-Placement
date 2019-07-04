/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static String solve(String s){
        int n=s.length();
        if(n<2) return s;
	    StringBuilder sb=new StringBuilder(s);

	    for(int i=n-2;i>=0;i--){
	        for(int j=n-1;j>i;j--){
		        if(s.charAt(i)<s.charAt(j)){
		            char c=s.charAt(i);
		            sb.setCharAt(i,s.charAt(j));
		            sb.setCharAt(j,c);
		            s=sb.toString();
		            
		            char[] ch=s.substring(i+1).toCharArray();
		            Arrays.sort(ch);
		            
		            s=s.substring(0,i+1)+new String(ch);
		            return s;
		        }
	        }
		 }
        return s;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    t--;
		    String s=sc.next();
		    String r=solve(s);
		    
		    if(r.equals(s)) System.out.println("not possible");
		    else System.out.println(r);
		}
	}
}
