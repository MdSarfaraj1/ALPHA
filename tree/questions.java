import java.util.*;
import java.util.HashMap;
public class questions {
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
    //tree is univalued or not
    public static boolean uni(Node root)
    {
        if(root==null)
        return true;
        int k=root.data;
        if(root.left!=null||root.right!=null)
        if(root.left.data!=k||root.right.data!=k)
        {
        return false;
        }
        
        return uni(root.left) && uni(root.right);


    }
    //invert binary tree
    public static Node invert(Node root)
    {
        if(root==null)
        return root;
       Node left= invert(root.left);
        Node right=invert(root.right);
            root.left=right;
            root.right=left;
        return root;
    } 
    // Delete the leaf nodes with the valu of x
    public static Node delete(Node root, int x)
    {
        if(root.left==null && root.right==null )
        {
            if(root.data==x)
            return null;
            else
            return root;
        }
    
        root.left=delete(root.left,x);
        root.right=delete(root.right,x);
        return root;

    }
    //find all duplicate subtrees
   public static HashMap<String,Integer>m=new HashMap<>();
    public static String duplicate(Node root)
    {
        if(root==null)
        return "";
        String str="(";
        str+=duplicate(root.left);
        str+=Integer.toString(root.data);
        str+=duplicate(root.right);
        str+=")";
        if( m.get(str)!=null && m.get(str)==1)
        System.out.println(str+" ");
        if(m.containsKey(str))
        m.put(str,m.get(str)+1);
        else
        m.put(str,1);
        return str;

    }
    public static void main(String args[])
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1}; //preorder
        int n[]={1,4,3,-1,-1,-1,3,4,3,-1,-1,-1,3,-1,-1};

        /*         1
         *       2   3
         *     4  5 6  7
         *             
         */
        createTree tree=new createTree();
        Node root=tree.build(n);
        //levelorder(root);
       String star=duplicate(root);
       // root=delete(root,4);
    // levelorder(root);
      
    }
    
}
