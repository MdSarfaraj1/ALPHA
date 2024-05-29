import java.util.*;/// o(n)
public class majority {
    public static void main(String args[])
    {
        int arr[]={1,3,2,5,1,3,3,3,5,1,1};
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            hs.put(num,hs.getOrDefault(num,0)+1);
          /*  if(hs.containsKey(num))
            {
                hs.put(num,hs.get(num)+1);
            }
            else
            {
                hs.put(num,1);
            }
            */ 
        }
      
        for(int x:hs.keySet())
        {
            if(hs.get(x)>(11/3))
            {
                System.out.print(x+" ");
            }
        }
    }
}
