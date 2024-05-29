import java.util.*;

public class count_unique_substrings 
{
     static class Node{
    Node children[]=new Node[26];
    boolean endofstring=false;
    public Node()
    {
        for(int i=0;i<26;i++)
        {
            children[i]=null;
        }
    }
}
public static Node root=new Node();
public static void insert(String word)//time complexito(L)
{
    Node curr=root;
    for(int i=0;i<word.length();i++)
    {
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            curr.children[idx]=new Node();
            
        }
        curr=curr.children[idx];
    }
    curr.endofstring=true;
}
public static boolean search(String word)//time complexito(L)
{
    Node curr=root;
    for(int i=0;i<word.length();i++)
    {
        int idx=word.charAt(i)-'a';
        if(curr.children[idx]==null)
        {
            return false;
        }
        curr=curr.children[idx];

    }
    return curr.endofstring==true;
}
public static int count(Node curr)
{
    if(curr==null)
    return 0;
    int count=0;
        for(int i=0;i<26;i++)
    {
        if(curr.children[i]!=null)
        count+=count(curr.children[i]);
    }
    return count+1;
}
    public static void main(String args[])
    {
        String k="ababa";
        for(int i=0;i<k.length();i++)
        {
            insert(k.substring(i));// inserting all suffix
        }
       System.out.println(count(root)); 
   
    
  }
}
