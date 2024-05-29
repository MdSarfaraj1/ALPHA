import java.util.*;
/**
 0----- 1
      /  
     2
     /
     3
 */
// if there  is no cycle  then graph will be bipartite
// there exist cycle but there is even number of nodes then bipartite
public class bipartite {
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
    int vertex=4;
    @SuppressWarnings("unchecked")
    ArrayList<edge>[] graph=new ArrayList[vertex];   // Creating an array of ArrayList<edge>  and the size of the array of 5
 for(int i=0;i<4;i++)// initiallizing  all 

 {
    graph[i]=new ArrayList<>();
 }
 graph[0].add(new edge(0,1,5));
 graph[1].add(new edge(1,0,5));
 graph[1].add(new edge(1,2,1));
 graph[2].add(new edge(2,1,1));
 graph[2].add(new edge(2,3,2));
 graph[3].add(new edge(3,2,2));
 
 // this is for if the there is multiple component in the graph

 System.out.println(isBipartite(graph));
}
public  static boolean isBipartite(ArrayList<edge>[] graph)
{
   // boolean[] visited=new boolean[5];
   int color[]=new int[graph.length];
   for(int i=0;i<color.length;i++)
   {
    color[i]=-1;  // initiallly no color
   }
   Queue<Integer> q=new LinkedList<>();
    for(int i=0;i<graph.length;i++)
    {
        if(color[i]==-1)
        {
            q.add(i);
            color[i]=0;  //yellow
            while(!q.isEmpty())
            {
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++)
                {
                    edge e=graph[curr].get(j);
                   
                    if(color[e.des]==-1)
                    {
                         int nextcolor=color[curr]==0?1:0;
                         color[e.des]=nextcolor;
                         q.add(e.des);
                    }
                    else if(color[e.des]==color[curr])
                    return false;
                }
            }
        }
    }
    return true;
   
}

}
