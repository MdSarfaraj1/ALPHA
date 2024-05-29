import java.util.HashMap;// NOT DONE YET


public class subarray_sum_equal_to_k{
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {

            sum+=arr[i];
            if(hm.containsKey(sum-3))
            {
                ans++;
            }
            else
            {
                hm.put(sum,i);
            }
        }
        System.out.println(ans);
    }
}

