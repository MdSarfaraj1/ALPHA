import java.util.*;
public class mergeKList {
    static class Node implements Comparable<Node>{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        @Override
        public int compareTo(Node n)
        {
            return this.data-n.data;
        }
    }
    public static boolean isEmpty(Node r)
    {
        return r==null;
    }
    public static Node merge(Node arr[],int n)
    {
        PriorityQueue<Node>pq=new PriorityQueue<>();
        Node head=new Node(0);
        Node last=head;
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
       
        while(!pq.isEmpty())
         {
            Node curr=pq.poll();
            last.next=curr;
            last=last.next;
            if(curr.next!=null)
            pq.add(curr.next);
        }
        return head.next;
    }
    public static void printList(Node ll)
    {
        while(!isEmpty(ll))
        {
            System.out.println(ll.data+" ");
            ll=ll.next;
        }
    }
        public static void main(String args[])
    {
        int N=3;
        Node[] a=new Node[N];
      Node head1=new Node(1);
      a[0]=head1;
      head1.next=new Node(3);
      head1.next.next=new Node(5);
      head1.next.next.next=new Node(7);

      Node head2=new Node(2);
      a[1]=head2;
      head2.next=new Node(4);
      head2.next.next=new Node(6);
      head2.next.next.next=new Node(8);

      Node head3=new Node(0);
      a[2]=head3;
      head3.next=new Node(9);
      head3.next.next=new Node(7);
      head3.next.next.next=new Node(13);
      Node head=merge(a,N);
      printList(head);
    }
}
