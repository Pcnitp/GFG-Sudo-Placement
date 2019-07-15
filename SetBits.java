/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int count=0;
		    while(n>0){
		        if((1&n)==1) count++;
		        n=n/2;
		    }
		    System.out.println(count);
		}
	}
}
