import java.util.PriorityQueue;

public class nropes {
    
    public static void main(String args[])
    {
        int arr[]={4,3,2,6};
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int count=0;
        while(pq.size()>1)
        {
            int e1=pq.remove();
            int e2=pq.remove();
            count+=e1+e2;
            pq.add(e1+e2);
         
        
    
        }
        System.out.println(count);

    }
    
}
