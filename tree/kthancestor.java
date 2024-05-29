import java.util.*;
public class kthancestor {
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
    static class createTree{
        static int idx=-1;
       public static Node build(int nodes[])
       {
        idx++;
        if(nodes[idx]==-1)
        return null;
        else
        {
            Node newNode=new Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }

       }
    }
    public static int idx=0;
    //kth ancestor
  /* public static Node kthancestor(Node root,int n,int k)
    {
        if(root==null)
        return null;
        Node ances=ancestor(root,n);
        if(ances!=null)
        {
        idx++;
        if(idx==k)
        return ances;
        }
    
      return  kthancestor(root,ances.data,k);
     
    } */
    //ancestor
    /*public static Node ancestor(Node root,int n)
    {
        if(root==null)
        return null;
        if(root.left!=null || root.right!=null)
        {
        if(root.left.data==n||root.right.data==n)
        return root;
        }
        Node left=ancestor(root.left,n);
        Node right=ancestor(root.right,n);
        if(left==null)
        return  right;
        if(right==null)
        return left;
        return root;
    }*/
    public static int Kancestor(Node root,int n,int k)
    {
        if(root==null)
        return -1;
        if(root.data==n)
        return 0;
        int left=Kancestor(root.left,n,k);
        int right=Kancestor(root.right,n,k);
        if(left==-1 && right==-1)
        return -1;
        int max=Math.max(left,right);
        if(max+1==k)
        System.out.println(root.data);
        return max+1;
    }
    public static void levelorder(Node root)
    {
        Queue<Node> q= new  LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
            System.out.println();
            if(q.isEmpty())
            break;
            else
            q.add(null);
            }
            else
            {
                System.out.println(curr.data);
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                
            }

        }
    }
    // trnsform tree to sum tree
    public static int trnsform(Node root)
    {
        if(root==null)
        return 0;
        int left=trnsform(root.left);
        int right=trnsform(root.right);
        int k=root.data;
        root.data=left+right;
        return k+root.data;
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1}; //preorder
        /*         1
         *       2   3
         *     4  5 6  7
         *             
         */
        createTree tree=new createTree();
        Node root=tree.build(nodes);
      //  Node anc=ancestor(root,7);
        trnsform(root);
        levelorder(root);
        //int k=kthancestor(root,8,3);
       // System.out.println(anc.data);
    }
    
}
