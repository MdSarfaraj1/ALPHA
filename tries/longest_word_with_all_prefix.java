//Not Done
import java.util.*;
public class longest_word_with_all_prefix {

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
    public static String ans="";
    public static void function(Node root, StringBuilder temp)
    {
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null && root.children[i].endofstring==true )
            {
                char ch=(char)(i+'a');
                temp.append(ch);
                if(ans.length()<temp.length())
                {
                    ans=temp.toString();
                }
                function(root.children[i],temp);
                //backtraking
                temp.deleteCharAt(temp.length()-1);
                
            }
           
        }
    }
    public static List<List<String>> group(String[] strs)
    {
      List<List<String>> ans=new ArrayList<>();
        for(String x:strs)
        {
            // sorting each word
            char c[]=x.toCharArray();
            Arrays.sort(c);
            String sorted= new String(c);
            if(!search(sorted))
           insert(sorted);
           else
           List<String> temp=new ArrayList<>();

        }
        return new 
    }
    public static void main(String[] args) 
    {
        String word[]={"appl","apply","y","app","ap","a","apple"};   
        StringBuilder temp=new StringBuilder(); 
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("thor"));
        System.out.println(search("theer"));
         function(root,temp);
         System.out.println(ans);

    }
}