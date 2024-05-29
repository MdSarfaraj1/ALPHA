import java.util.*;
 class node{
        int data;
        node next;
        public node(int value)
        {
            this.data=value;
            this.next=null;
        }
    }
    public class Main{

                                        //main  function
    public static void main(String args[])
    {
     linkedList ll=new linkedList();
    ll.printlist();
    ll.addFirst(5);
     ll.addFirst(7);
     ll.printlist();
    }
    }
  class linkedList 
{ 
    node head;
    node tail;
                                    // print function
    void printlist()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println(" ");
        return;

    }
                                     //add function
    void addFirst(int value)
    {
        node newnode=new node(value);
        if(head==null)
        {
            head.data=value;
            head.next=null;
            return;
        }
        newnode.data=value;
        newnode.next=head;
        head=newnode;

    }
}