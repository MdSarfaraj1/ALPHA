import java.util.*;

public class treemap {
    public static void main(String args[])
    {
    TreeMap<Integer,String>h=new TreeMap<>();
   
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

   
    }
}
