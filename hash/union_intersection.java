import java.util.HashMap;
import java.util.HashSet;

public class union_intersection {
    public static void main(String[] args)
    {
        int arr[]={4,3,2,6,5,7};
        int arr2[]={4,3,8,2,51,1};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr2.length;i++)
        {
            int num=arr2[i];
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
       
        System.out.println("The union is:");
        for(int x:hs.keySet())
        {
            
                System.out.print(x+" ");
            
        }
        System.out.println("The intersection is:");
        for(int x:hs.keySet())
        {
            if(hs.get(x)!=1)
            {
                System.out.print(x+" ");
            }
        }
    }
}
