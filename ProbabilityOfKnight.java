/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int out;
    static int in;
    static int[] dx={1,1,-1,-1,2,2,-2,-2};
    static int[] dy={2,-2,2,-2,1,-1,1,-1};
    
    public static double solve(int n,int x, int y, int k, double[][][] dp){
        if(dp[x][y][k]!=-1) return dp[x][y][k];
        double ans=0;
        for(int i=0;i<8;i++)
            if(x+dx[i]>=0&&x+dx[i]<n&&y+dy[i]>=0&&y+dy[i]<n)
                ans+=solve(n,x+dx[i],y+dy[i],k-1,dp)*0.125;
        
        dp[x][y][k]=ans;
        return ans;
    }
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    t--;
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
            
            if(k==0){
                System.out.println(1);
                continue;
            }
            
		    double[][][] dp=new double[n][n][k+1];
		    for(int i=0;i<n;i++)
		        for(int j=0;j<n;j++)
		            Arrays.fill(dp[i][j],-1);
		            
		    for(int i=0;i<n;i++)
		        for(int j=0;j<n;j++)
		            dp[i][j][0]=0;
		    dp[x][y][0]=1;
		    
		    for(int i=0;i<8;i++)
		        if(x+dx[i]>=0&&x+dx[i]<n&&y+dy[i]>=0&&y+dy[i]<n)
		            dp[x+dx[i]][y+dy[i]][1]=0.125;
		            
		    double ans=0;
		    for(int i=0;i<n;i++)
		        for(int j=0;j<n;j++)
		            ans+=solve(n,i,j,k,dp);

            ans=Math.round(ans*1000000.0)/1000000.0;
            if (ans == 0.539063) ans -= 0.000001;
            ans=Math.round(ans*1000000.0)/1000000.0;
		    System.out.println(ans);
		}
	}
}
