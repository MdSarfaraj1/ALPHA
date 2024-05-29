import java.util.*;
public class all_path_from_src_to_target {
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
     graph[0].add(new edge(0,3,1));
     graph[2].add(new edge(2,3,1));
     
     graph[3].add(new edge(3,1,3));
     
     graph[4].add(new edge(4,0,2)); 
     graph[4].add(new edge(4,1,1));
     
     graph[5].add(new edge(5,0,1));
     graph[5].add(new edge(5,2,3)); 
    
    int src=5;
    int desti=1;
    String path="";
    find(graph,src,desti,path);
    
}
public static void find(ArrayList<edge>[] graph,int src,int desti,String path)
{
 if(src==desti)
 System.out.println(path+desti);
 for(int i=0;i<graph[src].size();i++)
 {
    edge e=graph[src].get(i);
    find(graph, e.des, desti, path+src);
 }
}
}
