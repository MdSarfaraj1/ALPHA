import java.util.*;
public class closestOfK {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inorder(Node root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        System.out.print(" "+root.data);
        inorder(root.right);
    }
     //create the tree
     public static Node insert(Node root,int val)
     {
         if(root==null)
         {
             root=new Node(val);
             return root;
         }
         if(root.data>val)
         root.left=insert(root.left,val);
         else
         root.right=insert(root.right,val);
         return root;
     }
   
    
    
    //maximum sum of nodes of bst present in bt
     public static boolean valid(Node root)
     {
         if(root==null)
         return true;
         if(root.left!=null)
         {
         if(root.left.data>=root.data)
         return false;
         }
         if(root.right!=null)
         {
             if(root.right.data<=root.data)
             return false;
         }
         return valid(root.left) && valid(root.right);
     }        
    public static int largest(Node root)
    {
        if(root==null)
        return 0;
        int value=0;
        if(valid(root))
        {
            value=value(root);
            return value;
        }
     int left= largest(root.left);
      int right= largest(root.right);
      return Math.max(left,right);
        
    }
    public static int value(Node root)
    {
        if(root==null)
        return 0;
     int value=root.data;
     value+=value(root.left);
     value+=value(root.right);
     return value;
     }              
     public static ArrayList<Integer>arr=new ArrayList<>();
     public static void inorder2(Node root)
     {
        if(root==null)
        return;
        inorder2(root.left);
        arr.add(root.data);
        inorder2(root.right);
     }       
     public static void twosum(ArrayList<Integer> arr,int k)
     {
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)+arr.get(j)==k)
                System.out.println(arr.get(i)+"-"+arr.get(j));
            }
        }
     }
     static int mindiff=99999999;
     static int min_diff_node=0;
     public static void mindiff(Node root,int k)
     {
        if(root==null)
        return;
        if(root.data==k)
        {
        min_diff_node=root.data;  
        return;
        }
        if(mindiff>Math.abs(root.data-k))
        {
            mindiff=Math.abs(root.data-k);
            min_diff_node=root.data;

        }
        if(k<root.data)
        {
            mindiff(root.left,k);
        }
        else{
            mindiff(root.right,k);
        }

     }
    public static void main(String args[])
     {
         int nodes[]={7,5,13,45,3,887,6};
         Node root=null;
         for(int i=0;i<nodes.length;i++)
         { 
            root=insert(root,nodes[i]);
        }
        inorder(root);
        //inorder2(root);
       /* for(int x:arr)
        {
            System.out.print(x+" ");
        }
        twosum(arr,9);*/
        mindiff(root,4546458);
        System.out.println(min_diff_node);
      // System.out.println(largest(root));
    }
      
 
}
