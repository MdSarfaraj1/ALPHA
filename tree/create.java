import java.util.*;

public class create {
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
    static class Binary{
        static int idx=-1;
        public static Node build(int nodes[])
        {
            idx++;
            if(nodes[idx]==-1)
            return null;
            Node newNode=new Node(nodes[idx]);
            newNode.left=build(nodes);
            newNode.right=build(nodes);
            return newNode;
        }
    }
    static class each_node_depth{  // for traking every nodes depth , used in the function -> find
        Node node;
        int depth;
        public each_node_depth(Node node,int d)
        {
            this.node=node;
            depth=d;
        }
    }
   
    public static void inorder(Node root)
    {
        if(root==null)
        return ;
        inorder(root.left);
        System.out.print(" "+-root.data);
        inorder(root.right);
    }
    public static void preorder(Node root)
    {
        if(root==null)
        return ;  
        System.out.print(" "+-root.data);
        preorder(root.left);
       preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root==null)
        return ;  
       
        postorder(root.left);
       postorder(root.right);
        System.out.print(" "+-root.data);
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
    public static int height(Node root)
    {
        if(root==null)
        return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        return Math.max(lefth,righth)+1;
    }
    static int sum(Node root) //sum of the values of the nodes
    {
        if(root==null)
        return 0;
        int sumleft=sum(root.left);
        int sumright=sum(root.right);
        return sumleft+sumright+root.data;
    }
    public static int diameter(Node root)
    {
        if(root==null)
        return 0;
        int leftd=diameter(root.left);
        int lefth=height(root.left);
        int rightd=diameter( root.right);
        int righth=height(root.right);
        int selfd=lefth+righth+1;
        return Math.max(Math.max(leftd,rightd),selfd);


    }
    public static boolean isSubTree(Node root1,Node root2)
    {
        if (root1.data==root2.data)
        {
            if(isIdentical(root1,root2))
            return true;
        }
        return (isSubTree(root1.left,root2) || isSubTree(root1.right,root2));

    }
    public static boolean isIdentical(Node root1,Node root2)
    {
        if(root1==null && root2==null)
        return true;
        if(root1==null || root2==null || root1.data!=root2.data)
        return false;
        if(!isIdentical(root2.left,root2.left))
        return false;
        if(!isIdentical(root2.right,root2.right))
        return false;
        return true;
        
    }
    //print nodes of kth level
    public static void printklevel(Node root,int levl,int k)
    {
        if(root==null)
        return ;
        if(k==levl)
        {
            System.err.println(root.data);
            return;
        }
        else
        {
        printklevel(root.left,levl+1,k);
        printklevel(root.right,levl+1,k);
        }

    }
    //lowest common ancestor
    public static Node lca(Node root,int n1,int n2)
    {
        if(root==null||n1==root.data||n2==root.data)
        return root;
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);
        if(left==null)
        return right;
        if(right==null)
        return left;
        return root;
    }
    //minimum distance between nodes
    public static int minimum(Node root,int n1,int n2)
    {
        Node lca=lca(root,n1,n2);
        int dis1=distance(lca,n1);
        int dis2=distance(lca,n2);
        return dis1+dis2;
    }
    //distance between two nodes//supporting function for minimum
    public static int distance(Node root, int n)
    {
        Queue<Node>q=new LinkedList<>();
        int dis=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                dis++;
            if(q.isEmpty())
            break;
            else
            q.add(null);
            }
            else{
                if(curr.data==n)
                return dis;
                else
                {
                    if(curr.left!=null)
                    q.add(curr.left);
                    if(curr.right!=null)
                    q.add(curr.right);
                }

            }
        }
        return dis;

    }
    // find minimum depth of binary tree
    public static int find_depth(Node root)
    {
        if(root==null)
        return 0;
        Queue<each_node_depth>q=new LinkedList<>();
        each_node_depth qi=new each_node_depth(root, 0);
        q.add(qi);
        while(!q.isEmpty())
        {
            qi=q.remove();
            Node n=qi.node;
            int depth=qi.depth;
            if(n.left==null && n.right==null)
            {
                return depth;
            }
            if(n.left!=null)
            {
                qi.depth=depth+1;
                qi.node=n.left;
                q.add(qi);
            }
            if(n.right!=null)
            {
                qi.depth=depth+1;
                qi.node=n.right;
                q.add(qi);
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,8,-1,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1}; //preorder
        /*         1
         *       2   3
         *     4  5 6  7
         *    8           
         */
       // Binary tree=new Binary();
        Node root=Binary.build(nodes);
       // System.out.println(root.data);
       // inorder(root);
      // levelorder(root);
       // int k=height(root);
        //System.out.println(k);
       int d=minimum(root,8,7);
       System.out.println(d);
       //printklevel(root,1,4);
       System.out.print(find_depth(root));
    }

}
