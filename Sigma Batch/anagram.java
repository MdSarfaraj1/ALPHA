import java.util.*;
public class anagram {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1 = "anagram",s2="nagaram";
        int k=s1.length();
        int k2=s2.length();
        System.out.println(k+"  "+k2);
        for(int i=0;i<k-1;i++)
        {
            for(int j=0;j<k-i-1;j++)
            {
               if(s1.charAt(j)>s1.charAt(j+1))
               {
                char temp=s1.charAt(j);
                s1.setCharAt(j,s1.charAt(j+1));
                s1[j+1]=temp;


                }
            }
        }

    }
    
}
