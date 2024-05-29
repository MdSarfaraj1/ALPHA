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
        // search an element in the bst
        public static boolean search(Node root,int n)
        {
            if(root==null)
            return false;
            if(n==root.data)
            return true;
            else if(n<root.data)
            return search(root.left,n);
            else
            return search(root.right,n);
        }
        public static Node delete(Node root,int val)
        {
            if(root.data==val)
            {
             if( root.left==null && root.right== null)
            return null;
            else if(root.left==null)
            {
            return root.right;
            
            }
            else if( root.right==null)
            {
            return root.left;
                
            }
            else
            {
                Node is=inorderSuccesor(root.right);
                root.data=is.data;
                root.right=delete(root.right,is.data);
            
            }
            }
            else if(root.data > val)
            root.left=delete(root.left,val);
            else
            root.right=delete(root.right,val);
            return root;

        }
        public static Node inorderSuccesor(Node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }
        //print in reange 
        public static void deleterange(Node root ,int n1, int n2)
        {
            if(root!=null)
            {
                if(n1<=root.data && root.data<=n2)
                System.out.println(root.data+" ");
                deleterange(root.left,n1,n2);
                deleterange(root.right,n1,n2);
            }
            return;
        }
        // path from nodes to leaf                              //from here
        public static void prrintt(ArrayList<Integer>path)
        {
            for(int i=0;i<path.size() ;i++)
            {
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
        public static void traverse(Node root,ArrayList<Integer> path)
        {
            if(root==null)
            return;
            path.add(root.data);
            if(root.left==null && root.right==null)
            {
              prrintt(path);
            }
            traverse(root.left,path);
            traverse(root.right,path);
            path.remove(path.size()-1);
        }                                                       //to here
        
       
        public static Node mirror(Node root)
        {
            if(root==null)
            return root;
            Node left=mirror(root.left);
            Node right=mirror(root.right);
            root.left=right;
            root.right=left;
            return root;
        }
        //sorted array to balanced bst
        public static Node sortedtobst(int arr[],int s,int e)
        {
            if(s>e)
            return null; 
            int m=(s+e)/2;
            Node root=new Node(arr[m]);
            root.data=arr[m];
            root.left=sortedtobst(arr,s,m-1);
            root.right=sortedtobst(arr,m+1,e);
            return root;
        }
        //size of largest bst in binary tree   //  start from here
         //bst is valid or not
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
         int value=1;
         value+=value(root.left);
         value+=value(root.right);
         return value;
         }                              //end here
        // merge two bst
      public static Node merge(int arr1[],int arr2[])
      {
        int fina[]=new int[11];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                fina[k]=arr1[i];
                i++;
                k++;
            }
            else
            {
                fina[k]=arr2[j];
                j++;
                k++;
            }
        }
        while(i<arr1.length)
        {
            fina[k]=arr1[i];
            i++;
            k++;

        }
        
        while(j<arr2.length)
        {
            fina[k]=arr2[j];
            j++;
            k++;
            
        }
        System.out.println();
        for(int x:fina)
        {
            System.out.print(x+" ");
        }
        return sortedtobst(fina,0,10);

      } 
    public static void main(String args[])
    {
        //int nodes[]={8,5,3,1,4,6,10,11,14};
        int nodes[]={1,2,3,4,5};
        int nodes1[]={6,7,8,9,10,11};
        /*    for(int i=0;i<nodes.length;i++){ root=insert(root,nodes[i]);}
        // System.out.println(search(root,13));
     // root=delete(root,8);
    //inorder(root);
    // deleterange(root, 4, 11);
    // traverse(root, new ArrayList<>());
   //  System.out.println(valid(root));
    // root=mirror(root);*/ //System.out.println("\n"+largest(root));
   Node root1= sortedtobst(nodes,0,4);
   Node root2=sortedtobst(nodes1,0,5);
     inorder(root1);
     System.out.println("");
     inorder(root2);
    Node finalroot=merge(nodes,nodes1);
    inorder(finalroot);
    System.out.println(finalroot.data);
     

    }
}
