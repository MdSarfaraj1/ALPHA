import java.util.*;
class stacka{
    static class Node{
      public static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
      }
      }
                                                        //starting of stack class
    static class stack{
        static Node head=null;

         //push function 
        public static void push(int data)
        {
            Node newnode=new Node(data);
            if(isEmpty())
            {
                head=newnode;
                return ;
            }
            newnode.next=head;
            head=newnode;
        }
        //pop function
        public static int pop()
        {
            if(isEmpty())
            {
                System.out.println("stack is empty");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        //is empty function
        public static boolean isEmpty()
        {
            return head==null;
        }
        //print function
         public static void print()
          {
            Node temp=head;
              if(head==null)
              {
                System.out.println("Empty");
               }
             else
             while(temp!=null)
             {
            
              System.out.print(temp.data+"->");
              temp=temp.next;
              }
            System.out.print("null");
        }
        //main function
         public static void main(String args[])
        {
            stack s=new stack();
            s.push(1);
            s.push(2);
          s.push(3);
          s.push(4);
          s.push(5);
          s.print();
        
        }
  
    }//ending of stackclass
   
        
 }                                               
    
