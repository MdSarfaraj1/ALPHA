import java.util.*;
public class implement {
    static class HashMa<k,v>  // generic
    {
        private class Node{ // creating the class of the node 
            k key;
            v value;
            public Node(k key,v value)
            {
                this.key=key;
                this.value=value;
            }
        }
        private int n;//total number of keys (n)
        private int N;
        private LinkedList<Node> bucket[]; // N=bucket.length
        @SuppressWarnings("unchecked")
        public HashMap()      // constructor for the class hashmap
        {
            this.N=5;
            this.bucket=new LinkedList[5];
            for(int i=0;i<5;i++)
            {
                this.bucket[i]=new LinkedList<>();
            }
        }
        public int hashfunction(k key)// getting the hashcode 
        {
            int i=key.hashCode();
            return Math.abs(i)%N;
        }
        public int searchkey(k key,int bi)//checking if key is present or not
        {
            LinkedList<Node> ll=bucket[bi];
            int di=0;
                for(Node n:ll)
                {
                    if(n.key==key)
                    return di;
                    else
                    di++;

                }
                return -1;
         }
        public void put(k key,v value)
        {
            int bi=hashfunction(key);
            int di=searchkey(key,bi);
            if(di!=-1)
            {
                Node n=bucket[bi].get(di);
                n.value=value;

            }
            else
            {
                bucket[bi].add(new Node(key,value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0)
            rehashing();
           
        }
        private void rehashing()   // function for rehashing
        {
           /*  
            LinkedList<Node> old[]=bucket;
            @SuppressWarnings("unchecked")
            bucket=new LinkedList[2*N];
            for(int i=0;i<bucket.length;i++)  
            {
                bucket[i]=new LinkedList<>();
            }
            // copy old keys to new bucket
            for(int i=0;i<old.length;i++)   // taking the linked list of first index
            {
                LinkedList<Node> ll=old[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node n=ll.remove();
                    put(n.key,n.value);   // putting the old values to the resized bucket
                }

            }
            N=N*2;
            */

        }
        public v get(k key)
        {
            int bi=hashfunction(key);
            int di=searchkey(key,bi);
            if(di!=-1)
            {
                Node n=bucket[bi].get(di);
            return n.value;

            }
            else
           return null;
        }
        public boolean contains(k key)
        {
            int bi=hashfunction(key);
            int di=searchkey(key, bi);
            if(di!=-1)
            return true;
            else
            return false;

        }
        public v remove(k key)
        {
            int bi=hashfunction(key);
            int di=searchkey(key, bi);
            if(di!=-1)
           {
            Node node=bucket[bi].remove(di);
            n--;
           return node.value;
           }
         else
        return null;
        }
        public ArrayList<k> keySet()
        {
            ArrayList<k> arr=new ArrayList<>();
            for(int i=0;i<bucket.length;i++)   
            {
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node n=ll.get(j);
                    arr.add(n.key);
                }
            }
            return arr;

        }
        public boolean isEmpty()
        {
            return  n==0;
        }
        public ArrayList<v> values()
        {
            ArrayList<v> arr=new ArrayList<>();
            for(int i=0;i<bucket.length;i++)   
            {
                LinkedList<Node> ll=bucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node n=ll.get(j);
                    arr.add(n.value);
                }
            }
            return arr;
         }
       
        
    }
    public static void main(String args[])
    {
       
            HashMap<Integer,String>h=new HashMap<>();
            h.put(1,"a");
            h.put(2,"b");
            h.put(3,"c");
            h.put(4,"d");
            h.put(5,"e");
            h.put(6,"f");
            h.put(6,null);
            System.out.println(h.get(2));    
            System.out.println(h.get(23));
           ArrayList<Integer> a=new ArrayList<>();
           ArrayList<String> b=new ArrayList<>();
           a=h.keySet();
           b=h.values();
           for(int x:a)
           {
            System.out.print(x+" ");
           }
           System.out.println();
           for(String x:b)
           {
            System.out.print(x+" ");
           }


    }
    
}
