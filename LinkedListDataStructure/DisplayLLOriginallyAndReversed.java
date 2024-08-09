package LinkedListDataStructure;

public class DisplayLLOriginallyAndReversed
{


    static class Node       // node class
    {
        int data;
        Node next;      // this is the address of the next node.
        public Node(int data)       // constructor
        {
            this.data=data;
        }

    }


    // method for displaying LL recursively (not reversed).
    public static void displayRecusively(Node head)
    {
        if(head==null)
        {
            return;
        }
        else
        {
            System.out.print(head.data+" ");
            displayRecusively(head.next);
        }
    }

    // display the linked list in reverse order
    public static void displayReverseRecusively(Node head)
    {
        if(head==null)
        {
            return;
        }
        else
        {
            displayReverseRecusively(head.next);
            System.out.print(head.data+" ");
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

        System.out.print("Original Linked List : ");
        displayRecusively(a);

        System.out.print("\nLinked list in reversed order : ");
        displayReverseRecusively(a);

    }
}
