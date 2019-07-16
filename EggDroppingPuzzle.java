/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static int solve(int egg, int floor, int[][] dp){
        if(floor==0||floor==1 || egg==1) return floor;
        if(dp[egg][floor]!=-1) return dp[egg][floor];
        
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=floor;i++){
            int x=Math.max(solve(egg-1,i-1,dp),solve(egg,floor-i,dp));
            min=Math.min(min,x);
        }
        
        dp[egg][floor]=min+1;
        return min+1;
    }
    
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int egg=sc.nextInt();
            int floor=sc.nextInt();
            
            int[][] dp=new int[egg+1][floor+1];
            for(int i=0;i<=egg;i++)
                Arrays.fill(dp[i],-1);
                
            int ans=solve(egg,floor,dp);
            System.out.println(ans);
        }
	}
}
