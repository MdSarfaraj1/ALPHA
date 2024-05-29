import java.util.*;
class queueArray{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n)
        {
            size=n;
            rear=-1;
            front=-1;
            arr = new int[n];
        }
        public static boolean isEmpty()
        {
            return rear == -1;//if rear is equal to -1 return true else false that is why == signis used
        }
        //enqueue
        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("empty");
                return;
            }
            //adding first element
            if(front==-1)
            front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //dequeu functon
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            int k=arr[front];
            if(rear==front)  // removing the last element
            rear=front=-1;
            else
            front=(front+1)%size;
            return k;
        }
        // peek functin
        public  static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return arr[front];
        }
        //is full function
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }
    }
    public static void main(String args[])
    {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}