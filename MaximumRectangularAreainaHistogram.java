/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static long hist(long[] a){
        Stack<Integer> st=new Stack<>();
        int i=0;
        int n=a.length;
        long max=0;
        while(i<n){
            if(st.isEmpty()|| a[st.peek()]<a[i]){
                st.push(i);
                i++;
            }
            else{
                int top=st.pop();
                long area=0;
                if(st.isEmpty()) area=a[top]*(i);
                else area=a[top]*(i-st.peek()-1);
                
                max=Math.max(max,area);
            }
        }
        
        while(!st.isEmpty()){
            int top=st.pop();
            long area=0;
            if(st.isEmpty()) area=a[top]*(i);
            else area=a[top]*(i-st.peek()-1);
            max=Math.max(max,area);
        }
        return max;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    t--;
		    int n=sc.nextInt();
		    long[] a=new long[n];
		    for(int i=0;i<n;i++)
		        a[i]=sc.nextLong();
		    long ans=hist(a);
		    System.out.println(ans);
		}
	}
}
