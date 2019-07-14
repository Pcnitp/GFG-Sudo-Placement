{
//Initial Template for Java
import java.util.Scanner;
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class BinaryTree
{
    public static void main (String[] args) 
    {
         Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          
           while(t-->0){
            int n=sc.nextInt();
            if(n==0){
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                int a1=sc.nextInt();
                char lr=sc.next().charAt(0);
                if(i==0){
                    root=new Node(a);
                    switch(lr){
                        case 'L':root.left=new Node(a1);
                        break;
                        case 'R':root.right=new Node(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            
            GfG g=new GfG();
            System.out.println(g.maxDiff(root));
            
        }
    }
    public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    
    
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//Back-end complete function Template for Java
/*
class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
    int max;
    
    int mini(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int x=mini(root.left);
        int y=mini(root.right);

        max=Math.max(max,Math.max(root.data-x,root.data-y));
        return Math.min(root.data,Math.min(x,y));
    }
    
    int maxDiff(Node root){
        max=Integer.MIN_VALUE;
        mini(root);
        return max;
    }
}
