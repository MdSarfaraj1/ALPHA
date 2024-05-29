import java.util.ArrayList;

public class heap {//creating min heap
 
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data)
        {
            arr.add(data);
            int newidx=arr.size()-1;
            int parent=(newidx-1)/2;
            while(arr.get(newidx)<arr.get(parent))
            {
                int temp=arr.get(newidx);
                arr.set(newidx,arr.get(parent));
                arr.set(parent,temp); 
                newidx=parent;
                parent=(newidx-1)/2;
            }
           
        }
        public boolean isEmpty()
        {
            return arr.size()==0;
        }
       
        public int delete()
        {
            int data=arr.get(0);
            int temo=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temo);
            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }
        private void heapify(int i)
        {
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size()&& arr.get(minidx)>arr.get(left))
            {
                minidx=left;
            }
            if(right<arr.size()&& arr.get(minidx)>arr.get(right))
            {
                minidx=right;
            }
            if(minidx!=i)
            {
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp); 
                 heapify(minidx);
            }
          
        }
        public int peek()
        {
            return arr.get(0);
        }
    public static void main(String args[])
    {
        heap h=new heap();
        h.add(3);
        h.add(1);
        h.add(7);
        h.add(2);
        while(!h.isEmpty())
        {
            System.out.println(h.peek());
            h.delete();
        }
    }
}
