import java.util.*;

public class nearByCars {
    static class Point
    {
        int x;int y;int dissq;int idx;
        public Point(int x,int y, int dissq,int idx)
        {
            this.x=x;
            this.y=y;
            this.dissq=dissq;
            this.idx=idx;

        }
      /*   @Override
        public int compareTo(Point p2)
        {
            return this.dissq-p2.dissq;
        }*/
        
    }
    public static void main(String args[])
    {
        int pts[][]={{3,3},{5,-1},{-2,4}};
        PriorityQueue<Point>pq=new PriorityQueue<>();
        int k=2;
        for(int i=0;i<pts.length;i++)
        {
            int dissq=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],dissq,i));

        }
        for(int i=0;i<k;i++)
        {
            System.out.println("c"+pq.remove().idx);
        }

    }
}
