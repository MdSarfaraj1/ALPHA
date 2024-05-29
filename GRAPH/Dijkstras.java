import java.util.*;
public class Dijkstras {
    static class edge
    {
        int src,des,weight;
        public edge(int s,int d,int w)
        {
            src=s;
            des=d;
            weight=w;
            
        }
    }
    public static void main(String[] args) {
        int vertex=6;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph=new ArrayList[vertex];   // Creating an array of ArrayList<edge>  and the size of the array of 5
     for(int i=0;i<6;i++)// initiallizing  all 
    
     {
        graph[i]=new ArrayList<>();
     }
     graph[0].add(new edge(0,1,2));
     graph[0].add(new edge(0,2,4));

     graph[1].add(new edge(1,3,7));
     graph[1].add(new edge(1,2,1));

     graph[2].add(new edge(2,4,3));
     
     graph[3].add(new edge(3,5,1));
     
     graph[4].add(new edge(4,3,2)); 
     graph[4].add(new edge(4,5,5));
     Dijkstra(graph, 0);
     }
     static class pair implements Comparable<pair>
     {
        int n;
        int cost;
        public pair(int n,int cost)
        {
            this.n=n;
            this.cost=cost;
        }
        @Override
        public int compareTo(pair p2)
        {
            return this.cost-p2.cost; //cost based sorting 
        }
     }
     public static void Dijkstra(ArrayList<edge> graph[],int src)
     {
        int dis[]=new int[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(i!=src)
            dis[i]=Integer.MAX_VALUE;

        }
        PriorityQueue<pair> pq=new PriorityQueue<>();
        boolean visited[]=new boolean[graph.length];
        pq.add(new pair(src,0)); // source to source
        while(!pq.isEmpty())
        {
            pair curr=pq.remove();
            if(!visited[curr.n])
            {
                visited[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++)// neighbours
                {
                    edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.des;
                    int wt=e.weight;
                    
                    if(dis[u]+wt<dis[v]) // update distance
                    dis[v]=dis[u]+wt;
                    pq.add(new pair(v, dis[v]));
                }
            }
        }
        for(int x:dis)
        {
            System.out.print(x+" ");
        }
     }
}
