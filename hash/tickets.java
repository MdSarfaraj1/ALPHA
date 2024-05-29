import java.util.*;

public class tickets {
    public static String getReverse(HashMap<String,String> tickets)
    {
        HashMap<String,String> reverse=new HashMap<>();
        for(String key:tickets.keySet())
        {
            reverse.put(tickets.get(key),key);
        }
        for(String x:tickets.keySet()){
            if(!reverse.containsKey(x))
            return x;
        }
        return null;
        

    }
    public static void main(String[] args)
    {
        HashMap<String,String>fto=new HashMap<>();
        fto.put("cennai","bengaluru");
        fto.put("mumbai","delhi");
        fto.put("goa","cennai");
        fto.put("delhi","goa");
      String start=getReverse(fto);
      System.out.print(start);
      for(String x:fto.keySet())
      {
        System.out.print("->"+fto.get(start));
        start=fto.get(start);
      }
    
       
        
    }
}
