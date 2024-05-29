import java.util.*;
class queueLlist{
    // node class
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }
  //  Queue class
    static class Queue{
        static Node head=null;
        static Node tail=null;
          public static boolean isEmpty()
        {
          return head==null && tail==null;
        }

        //enqueue
        public static void add(int data)
        {
           Node newn=new Node(data);
           if(head==null)
           {
            head=tail=newn;
           }
           else
           {
            tail.next=newn;
            tail=newn;
           }
        }
        //dequeu functon
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            int k=head.data;
            if(head==tail)
            {
                head=tail=null;
            }
            else
            head=head.next;
            return k;
        }
        // peek functin
        public  static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return head.data;
        }
       

    }
    public static void main(String args[])
    {
        
        //JAva collection framework ->
        //Queue<Integer> q= new LinkedList<>();
        //Queue<Integer> q= new ArrayDeque<>();
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }

}