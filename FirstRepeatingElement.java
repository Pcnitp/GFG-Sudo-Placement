/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    int max=0;
		    int[] b=new int[n];
		    String[] temp=br.readLine().split(" ");
		    int ans=-1;
		    for(int i=0;i<n;i++){
		        b[i]=Integer.parseInt(temp[i]);
		        max=Math.max(max,b[i]);
		    }
		    
		    max++;
		    int[] a=new int[max];
		    for(int i=0;i<n;i++)
		        a[b[i]]++;
		    
		    for(int j=0;j<n;j++){
		        if(a[b[j]]<2) continue;
		        ans=j+1;
		        break;
		    }
		    System.out.println(ans);
		}
	}
}
