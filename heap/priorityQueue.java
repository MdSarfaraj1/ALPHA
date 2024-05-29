import java.util.*;
public class priorityQueue {
    
    public static void main(String args[])
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();//default:accending
        //PriorityQueue<>(Comparator.reverseOrder());for decending order
        pq.add(5);
        pq.add(7);
        pq.add(1);
        pq.add(3);
        pq.add(0);
        while(!pq.isEmpty())
        {
            System.out.println(pq.remove());
        }
    }
}
