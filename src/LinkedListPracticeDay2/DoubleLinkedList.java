package LinkedListPracticeDay2;

public class DoubleLinkedList {
    public Node head = null;
    public Node tail = null;
    public void addNode (int data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            head=tail=newNode;
            head.previous=null;
        }
        else
        {
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
        }
        tail.next=null;
    }
    public void display ()//display data in input order
    {
        Node current =head;
        if (current==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            while (current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
    }
    public void reverseDisplay ()//display data in reverse order
    {
        Node pointer = tail;
        if (head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            while (pointer!=head.previous)
            {
                System.out.print(pointer.data+" ");
                pointer=pointer.previous;
            }
        }
    }
    public void addAtFirst (int data)
    {
        Node newNode = new Node(data);
        Node temp=head;
        if (head==null)
        {
            System.out.println("List is empty");
            head=tail=newNode;
            head.previous=null;
        }
        else
        {
            newNode.next=head;
            head.previous=newNode;
            head=newNode;
            newNode.previous=null;
        }
    }
}
