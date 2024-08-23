package LinkedListDataStructure;

public class Temp   // temp class.
{

    public static class Node       // node  class
    {
        int data;
        Node next;      // this is the address of the next node..
        public Node(int data)       // constructor..
        {
            this.data=data;
        }
    }

    public static class linkedList
    {
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val)
        {

            Node temp=new Node(val);    // creating a new node..

            if(head==null)  // this means if the LL is empty.
            {
                head=temp;
            }
            else    // for a non-empty LL.
            {
                tail.next=temp;
            }
            tail=temp;  // because this operation is being performed in both the cases , ie tail is always equal to temp.
        }
    }
    public static void main(String[] args)
    {
        linkedList ll=new linkedList();
        ll.insertAtEnd(5);

        // displaying the LL iteratively.
        System.out.print("LL is : ");

        Node temp;
        while(ll.head!=null)
        {
            temp=ll.head;
            System.out.print(temp+" ");
            temp=temp.next;
        }
    }
}
