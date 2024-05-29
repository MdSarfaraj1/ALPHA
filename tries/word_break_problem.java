import java.util.*;

public class word_break_problem {
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
    public static void insert(String word)            //time complexito(L)
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
    public static boolean search(String word)           //time complexito(L)
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
    public static boolean brekword(String word)
    
    {if(word.length()==0)
        return true;
        for(int i=1;i<=word.length();i++)
        {

            if(search(word.substring(0, i)) && brekword(word.substring(i)))
            {
                return true;
            }

         }
        return false;
    }
    public static void main(String[] args) {
        
        String word[]={"i","love","samsung","do","uu"};    
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        String h="ilovedo";
        System.out.println(brekword(h));

    }
    
}
