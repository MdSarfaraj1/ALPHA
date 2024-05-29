import java.util.*;
public class prefix_problem {
    static class Node{
        Node children[]=new Node[26];
        boolean endofstring=false;
        int freq=1;
        public Node()
        {
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
         
                
            }
            else{
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.endofstring=true;
    }
    public static void prefix(Node root,String ans)   
    {
        if(root==null)
        {return;}
        if(root.freq==1)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i]!=null)
            prefix(root.children[i],ans+(char)(i+'a'));
        }
    }
    
    public static void main(String[] args) 
    {
        String word[]={"zebra","dog","duck","dove"};    
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        root.freq=-1;
       prefix(root,"");
      
    }
}
