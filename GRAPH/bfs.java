import java.util.*;
public class bfs {
    
/**
 0----- 1
      /  \
     2----3
     /
     4 
 */
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
    int vertex=5;
    @SuppressWarnings("unchecked")
    ArrayList<edge>[] graph=new ArrayList[vertex];   // Creating an array of ArrayList<edge>  and the size of the array of 5
 for(int i=0;i<5;i++)// initiallizing  all 

 {
    graph[i]=new ArrayList<>();
 }
 graph[0].add(new edge(0,1,5));
 graph[1].add(new edge(1,0,5));
 graph[1].add(new edge(1,2,1));
 graph[1].add(new edge(1,3,3));
 graph[2].add(new edge(2,1,1));
 graph[2].add(new edge(2,4,2));
 graph[2].add(new edge(2,3,1));
 graph[3].add(new edge(3,1,3)); 
 graph[3].add(new edge(3,2,1));
 graph[4].add(new edge(4,2,2));
 
 // this is for if the there is multiple component in the graph
 boolean[] visited=new boolean[5];
 for(int i=0;i<graph.length;i++)
 {
    if(!visited[i])
    {
        bfs(graph,visited);
    }
 }


    
}
public  static void bfs(ArrayList<edge>[] graph,boolean[] visited)
{
      Queue<Integer> q=new LinkedList<>();
     
      q.add(0);
        
      while(!q.isEmpty())
      {
        int curr=q.remove();
        if(!visited[curr])
        {
            System.out.println(curr+" ");
            visited[curr]=true;
            for(int i=0;i<graph[curr].size();i++)
            {
                edge e=graph[curr].get(i);
                q.add(e.des);
            }
        }
      }
}    
}


