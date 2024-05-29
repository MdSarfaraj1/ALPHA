//delete n nodes after m nodes
import java.util.*;
class ll {
    public static class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static LinkedList<Integer> head=new LinkedList<>();
    head=null;
    // adding function
    public static void add(int data)
    {
        Node newnode = new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
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
    // main funbction
    public static void main(String args[])
    {
       
        head.add(9);
        head.add(8);
        head.add(7);
        head.add(6);
        head.add(5);
        head.add(4);
        head.add(3);
        head.add(2);
        head.add(1);
        head.print();
        head.remove(2,2);
        head.print();
    }
    //recuired function
   public void remove(int m,int n)
    {
        Node curr=head;
        Node temp=null;
        while(curr!=null)
        {
        for(int i=1;i<=m;i++)
        {
            temp=curr;
            curr=curr.next;
        }
        while(n>1)
        {
            n--;
            curr=curr.next;
        }
        temp.next=curr;
        curr=curr.next;
        }
    }
}