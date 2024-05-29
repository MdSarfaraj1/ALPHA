import java.util.*;
class Queues2stack
{
    static class Queue
    {
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();
        public static boolean isEmpty()
        {
          return s1.isEmpty();
        }

 
    //add function
    public static int remove()
    {
        if(s1.isEmpty())
        {
           return -1;
            
        }
        else
        {
        while(!s1.isEmpty())
        {
            int k=s1.pop();
            s2.push(k);
        }
       int k=s2.pop();
         while(!s2.isEmpty())
        {
           
            s1.push(s2.peek());
            s2.pop();
        }
        return k;
        
        }
        
    }
    // remove function
    public static void add(int data)
    {
       s1.push(data);
   
    }
    // peek function
    public static int peek()
    {
        if(isEmpty())
        return -1;
        else
        return s1.peek();
    }
   }
    public static void main(String args[])
    {
      Queue q=new Queue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.remove();
      while(!q.isEmpty())
      {
        System.out.println(q.remove());
       
      }

    }
}