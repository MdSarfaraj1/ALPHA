import java.util.*;
/**
 * cycle_detection for undirected graph
 * **
 0----- 1
      /  \
     2----3
     /
     4 
 */

public class cycle_detection_undi {
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
System.out.print(detect_cycle_dfs(graph));// caling using depth fs
System.out.print(detect_cycle_bfs(graph));// caling using breath fs
}
public static boolean detect_cycle_dfs(ArrayList<edge>[] graph)// using dfs apporach  // this is use if there is different components of the graphh
{
    boolean[] visited=new boolean[5];
    for(int i=0;i<graph.length;i++)
    {
        if(!visited[i])
        {
            if(detect_cycle_helper_dfs(graph,visited,i,-1))
            {
                return true;
            }
        }
    }
    return false;
}
public static boolean detect_cycle_bfs(ArrayList<edge>[] graph)// using bfs apporch
{
    boolean[] visited=new boolean[5];
    for(int i=0;i<graph.length;i++)
    {
        if(!visited[i])
        {
            if(detect_cycle_helper_bfs(graph,visited,i))
            {
                return true;
            }
        }
    }
    return false;
}
    public static boolean detect_cycle_helper_bfs(ArrayList<edge>[] graph,boolean[] visited,int  curr)  // using bfs
{
 Queue<Integer> q=new LinkedList<>();
 q.add(curr);
 while(!q.isEmpty())
 {
    int k=q.remove();
    if(visited[k])
    return true;
    visited[k]=true;  // mark as visited
    for(int i=0;i<graph[k].size();i++)
    {
        edge e= graph[k].get(i);
        if(!visited[e.des])
        q.add(e.des);
    }
 }
 return false;

}



public static boolean detect_cycle_helper_dfs(ArrayList<edge>[] graph,boolean[] visited,int  curr,int parent)// using dfs
{
    visited[curr]=true;
    for(int i=0;i<graph[curr].size();i++)
    {
        edge e=graph[curr].get(i);
        if(!visited[e.des] && detect_cycle_helper_dfs(graph, visited, e.des, curr))
        {
            return true;
        }
        else if(visited[e.des] && e.des!=parent)
        {
            return true;
        }
        else
        {
            continue;
        }
    }
    return false;
}


    
}