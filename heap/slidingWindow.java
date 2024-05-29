import java.util.*;

public class slidingWindow {
    public static void main(String args[])
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        int arr[]= {1,3,-1,-3,5,3,6,7};
        int k=3,j=0;
        int ans[]=new int[8-k+1];
        for(int i=0;i<arr.length-2;i++)
        {
            int l=i;
            for(int y=0;y<k;y++)
            {
                
            pq.add(arr[l]);
            l++;
            }
                ans[j]=pq.peek();
                pq.remove();
                pq.remove();
                pq.remove();
                j++;
            
            
        }
        for(int x:ans)
        {
            System.out.println(x+" ");
        }
    }
}
