package CircularLinkedList;

import java.util.Scanner;

public class CircularList {
    public Node head = null;
    public Node tail=null;
    Scanner input = new Scanner(System.in);
    public void addNode (int data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
    }
    public void display ()
    {
        Node counter=head;
        while (counter!=tail)
        {
            System.out.print(counter.data+" ");
            counter=counter.next;
        }
        System.out.print(tail.data);
        System.out.println();
    }
    public Node searchNode (int val)
    {
        Node current = head;
        while (true)
        {
            if (current==null)
            {
                System.out.println("No item in linked list");
                return null;
            }
            else if (current.data==val)
            {
                return current;
            }
            current=current.next;
        }
    }
    public void remove (int data)
    {
        Node n = searchNode(data);
        Node counter = head;
        Node currentBack;
        if (n==null)
        {
            System.out.println("No matches found on list ");
        }
        else if (n==head)
        {
            head=head.next;
            tail.next=head;
        }
        else if (n==tail)
        {
            Node pointer=head;
            while (true)
            {
                if (pointer.next==tail)
                {
                    pointer.next=head;
                    tail=pointer;
                    tail.next=head;
                }
                pointer=pointer.next;
            }
        }
        else
        {
            while (counter!=null)
            {
                if (counter.next==n)
                {
                    counter.next=counter.next.next;
                    break;
                }
                counter=counter.next;
            }
        }
    }
    public void traverse ()
    {
        Node counter=head;
        while (true) {
            System.out.println("Enter f to forward and break to break : ");
            String str = input.next();
            if (str.equals("f"))
            {
                counter=counter.next;
                System.out.println(counter.data+" ");
            }
            else if (str.equals("break"))
            {
                break;
            }
            else
            {
                System.out.println("Invalid match found");
            }
        }
    }
}
