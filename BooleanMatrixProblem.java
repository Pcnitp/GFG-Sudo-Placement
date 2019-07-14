/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String[] temp=br.readLine().split(" ");
		    int r=Integer.parseInt(temp[0]);
		    int c=Integer.parseInt(temp[1]);
		    HashMap<Integer,Integer> row=new HashMap<>();
		    HashMap<Integer,Integer> col=new HashMap<>();
		    
		    for(int i=0;i<r;i++){
		        String[] ty=br.readLine().split(" ");
		        for(int j=0;j<c;j++){
		            int x=Integer.parseInt(ty[j]);
		            if(x==0) continue;
		            if(!row.containsKey(i)) row.put(i,1);
		            if(!col.containsKey(j)) col.put(j,1);
		        }
		    }
		    
		    int[][] a=new int[r][c];
		    for(int x:row.keySet())
		        for(int j=0;j<c;j++)
		            a[x][j]=1;
		    
		    
		    for(int x:col.keySet())
		        for(int j=0;j<r;j++)
		            a[j][x]=1;
		    
		    
		    for(int i=0;i<r;i++){
		        StringBuilder sb=new StringBuilder();
		        for(int j=0;j<c;j++)
		            sb.append(a[i][j]+" ");
		        System.out.println(sb);
		    }
		}
	}
}
