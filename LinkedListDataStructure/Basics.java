package LinkedListDataStructure;

public class Basics
{
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

        // connect the elements with each other
        a.next=b;
        b.next=c;
        c.next=d;

    }
}
