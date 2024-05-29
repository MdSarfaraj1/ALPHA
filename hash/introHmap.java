import java.util.*;
class introHMap{
    public static void main(String args[])
    {
    HashMap<Integer,String>h=new HashMap<>(5);
    h.put(1,"a");
    h.put(2,"b");
    h.put(3,"c");
    h.put(4,"d");
    h.put(5,"e");
    h.put(6,"f");
    h.put(6,null);
    System.out.println(h.get(2));    
    System.err.println(h.get(23));
    System.out.println(h);

    h.remove(2);
    System.out.println(h);
    System.out.println(h.containsKey(3));
    Set<Integer>s=h.keySet();
    System.out.println(s);
    Set<String>v=new HashSet<>(h.values());
    System.out.println(v);



}


}