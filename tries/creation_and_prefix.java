import java.util.*;  // time complexito(L) where L is the length of longest word
/**
 * creation
 */
public class creation_and_prefix {

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
    public static boolean ifPrefix(String prefix)
    {
        Node curr=root;
        for(int i=0;i<prefix.length();i++)
        {
            if(curr.children[prefix.charAt(i)-'a']==null)
            {
                return false;
            }
            curr=curr.children[prefix.charAt(i)-'a'];
        }
        return true;
    }
    
    public static void main(String[] args) 
    {
        String word[]={"the","any","their","a","thee"};    
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("thor"));
        System.out.println(search("theer"));
        System.out.println(ifPrefix("thei"));

    }
}