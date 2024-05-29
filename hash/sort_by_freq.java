import java.util.*;

public class sort_by_freq {
    public static void main(String args[])
    {
        String s="abbcccdddafgd";
        TreeMap<Character,Integer> hm=new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        //create a list of character and sort it according to frequency
        List<Character> cha=new ArrayList<>(hm.keySet());
        cha.sort((a,b)->hm.get(b)-hm.get(a));  //lambda expression
        //buyild the sorted string
        StringBuilder ans=new StringBuilder();
        for(char c:cha)
        {
            int freq=hm.get(c);
            for( int i=0;i<freq;i++)
            {
                ans.append(c);
            }
        }
        System.out.println(ans);


    }
}
