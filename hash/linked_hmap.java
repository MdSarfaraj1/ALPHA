import java.util.*;

public class linked_hmap {
     public static void main(String args[])
    {
        
    LinkedHashMap<Integer,String>h=new LinkedHashMap<>();
   
    Integer arr[]=new Integer[h.size()];

    h.put(6,"f");
     h.put(1,"a");
    h.put(2,"b");
    h.put(3,"c");
    h.put(4,"d");
    h.put(5,"e");
    h.put(6,"f");
    h.put(6,null);
    h.put(1,"m");
    System.out.println(h.get(2));    
    System.err.println(h.get(23));
    System.out.println(h);
Set<Integer> s=h.keySet();
arr=s.toArray(arr);
/*same can be written as Integer arr=h.toArray(new Integer[0]) */
 for(int x:arr)
 {
    System.out.println(x);
 }

   
    }
    
}
