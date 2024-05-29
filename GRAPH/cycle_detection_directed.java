import java.util.*;
/**
 0----->2
<| <\    |   
 |    \ <|      
 1     3
      
 */
public class cycle_detection_directed {
    static class edge
{
    int src,des;
    public edge(int s,int d)
    {
        src=s;
        des=d;
        
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
 graph[0].add(new edge(0,2));
 graph[1].add(new edge(1,0));
 graph[2].add(new edge(2,3));
 graph[3].add(new edge(3,0)); 
 System.out.println(isCycle(graph));
}
public static boolean isCycle(ArrayList<edge>[] graph)
{
    boolean visited[]=new boolean[graph.length];
    boolean stack[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++)
    {
        if(!visited[i])
        {
            if(isCycleUtil(graph,i,visited,stack));
            return true;
        }
    }
    return false;
}
public static boolean isCycleUtil(ArrayList<edge>[] graph,int curr,boolean visited[],boolean stack[])
{
    visited[curr]=true;
    stack[curr]=true;
    for(int i=0;i<graph[curr].size();i++)
    {
        edge e=graph[curr].get(i);
        if(stack[e.des])
        {
            // the destination is present in the stack so cycle exist
            return true;
        }
        if(!visited[e.des] && isCycleUtil(graph, e.des, visited, stack))
        {
            return true;
        }
       

    }
    stack[curr]=false;
    return false;
}
    
}
