import java.util.*;
/**
 * topologocal_sorting using dfs
 */
public class topologocal_sorting {
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
 graph[0].add(new edge(0,0,5));
 graph[1].add(new edge(1,1,5));
 
 graph[2].add(new edge(2,3,1));
 
 graph[3].add(new edge(3,1,3));
 
 graph[4].add(new edge(4,0,2)); 
 graph[4].add(new edge(4,1,1));
 
 graph[5].add(new edge(5,0,1));
 graph[5].add(new edge(5,2,3)); 
 edge e=graph[0].get(0);
 System.out.println(e.des);
 topological_using_dfs(graph);
 while (!stack.isEmpty())
  {
    System.out.print(stack.pop()+" ");   
 }
    
}
public static void topological_using_dfs(ArrayList<edge>[] graph)
{
    boolean visited[]=new boolean[graph.length];
    
    for(int i=0;i<graph.length;i++)
    {
        if(!visited[i])
        topo_helper(graph,visited,i);
    }

}
static Stack<Integer> stack=new Stack<>();
public  static void topo_helper(ArrayList<edge>[] graph,boolean visited[],int curr)
{
    visited[curr]=true;
    for(int j=0;j<graph[curr].size();j++)
    {
        edge e= graph[curr].get(j);
        if(!visited[e.des])
        {
            topo_helper(graph, visited, e.des);
        }
    }
    stack.push(curr);
    
}
}