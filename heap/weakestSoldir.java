import java.util.*;

public class weakestSoldir {
    static class soilder implements Comparable<soilder>
    {
        int count;
        int idx;
        public soilder(int count,int idx)
        {
            this.count=count;
            this.idx=idx;
        }
        @Override
        public int compareTo(soilder s) 
        {
            if(this.count==s.count)
            {
                return this.idx-s.idx;
            }
            else
            return this.count-s.count;
        }
    }
    public static void main(String args[])
    {
        int arr[][]={{1, 0, 0, 0},
                        {1, 1, 1, 1},
                        {1, 0, 0, 0},
                        {1, 0, 0,0}};
        int k=2;
        PriorityQueue<soilder>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                count++;
            }
            pq.add(new soilder(count,i));

        }
        for(int i=0;i<k;i++)
        {
        System.out.println("r"+pq.remove().idx);

        }
    }
}
