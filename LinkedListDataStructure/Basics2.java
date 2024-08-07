package LinkedListDataStructure;

public class Basics2
{

    public static void display(Node head)
    {
        Node temp=head;

        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    static class Node
    {
        int data;
        Node next;      // this is the address of the next node.
        public Node(int data)       // constructor
        {
            this.data=data;
        }

    }

    public static void main(String[] args)
    {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(100);

        // connect the elements with each other
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;


        // printing elements of linked list using loop.

       display(a);

    }
}
