package LinkedListDataStructure;

public class LengthOfLL
{

    public static class Node       // node  class
    {
        int data;
        Node next;      // this is the address of the next node.
        public Node(int data)       // constructor
        {
            this.data=data;
        }

    }
    public static int Length(Node head)        // method to find the length of LL
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }

    public static void main(String[] args)
    {

        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(100);
        Node f=new Node(200);

        // connect the elements with each other
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;


        // calling the length method.
        System.out.println("Length of the LL is : "+Length(a));


    }
}
