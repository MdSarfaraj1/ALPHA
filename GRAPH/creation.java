import java.util.*;
/**
 0----- 1
      /  \
     2----3
     /
     4 
 */
public class creation {
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

 //printing 2's neighbours
 for(int i=0;i<graph[2].size();i++)
 {
    edge e=graph[2].get(i);
    System.out.println(e.des);
 }
    
}
    
}