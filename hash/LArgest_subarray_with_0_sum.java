import java.util.*;
public class LArgest_subarray_with_0_sum {
    public static void main(String args[])
    {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {

            sum+=arr[i];
            if(hm.containsKey(sum))
            {
                ans=Math.max((i-hm.get(sum)),ans);
            }
            else
            {
                hm.put(sum,i);
            }
        }
        System.out.println(ans);
    }
}
