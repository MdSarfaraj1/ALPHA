import java.lang.reflect.Array;
import java.util.*;

public class anagram_of_list {
    public static List<List<String>> group(String[] strs)
    {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String x:strs)
        {
            // sorting each word
            char c[]=x.toCharArray();
            Arrays.sort(c);
            String sorted= new String(c);
            if(!hm.containsKey(sorted))
            {
                hm.put(sorted,new ArrayList<>());
            }
            hm.get(sorted).add(x);

        }
        return new ArrayList<>(hm.values());
    }
    public static void main(String[] args) {
        String[] arr={"hello","elloh","don","nod","hellol"};
        List<List<String>> answr=group(arr);
        System.out.println(answr);
    }
}
