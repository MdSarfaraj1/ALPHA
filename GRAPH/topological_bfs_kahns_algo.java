import java.util.*;
public class topological_bfs_kahns_algo {
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

 graph[2].add(new edge(2,3,1));
 
 graph[3].add(new edge(3,1,3));
 
 graph[4].add(new edge(4,0,2)); 
 graph[4].add(new edge(4,1,1));
 
 graph[5].add(new edge(5,0,1));
 graph[5].add(new edge(5,2,3)); 
 int[] indegree=indeg(graph);

 topological(graph,indegree);
}
public static void topological(ArrayList<edge>[] graph,int[] indegree)
{
    Queue<Integer> q=new LinkedList<>();
     for(int i=0;i<indegree.length;i++)
    {
        if(indegree[i]==0)
        {
            q.add(i);
         
        }
    }
    while(!q.isEmpty())
    {
    int curr=q.remove();
    System.out.print(curr+" ");
    for(int i=0;i<graph[curr].size();i++)
    {
        edge e=graph[curr].get(i);
        indegree[e.des]--;
        if (indegree[e.des]==0) { //***** 
            q.add(e.des);
            
        }
    }
    /*for(int i=0;i<indegree.length;i++) why not working instead of this *****
    {
        if(indegree[i]==0)
        {
            q.add(i);
         
        }
    } */
    
 
   }

}

public static int[] indeg(ArrayList<edge>[]graph) // for calculating indegree of each node
{
    int indegree[]=new int[graph.length]; 
    for(int curr=0;curr<graph.length;curr++)
    {
    for(int i=0;i<graph[curr].size();i++)
    {
        edge e=graph[curr].get(i);
        indegree[e.des]++;
    }
   }
  return indegree;
}
    
}
