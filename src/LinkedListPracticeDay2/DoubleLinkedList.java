package LinkedListPracticeDay2;
import java.util.*;
public class DoubleLinkedList {
    public Node head = null;
    public Node tail = null;
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
            newNode.back=tail;
            tail=newNode;
        }
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
    public Node searchNode (int val)
    {
        Node pointer=head;
        while (true)
        {
            if (pointer.data==val)
            {
                return pointer;
            }
            else if (pointer.next==null)
            {
                System.out.println("No match found");
                break;
            }
            pointer=pointer.next;
        }
        return pointer;
    }
    public void reverseDisplay ()
    {
        Node pointer = tail;
        if (head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            System.out.println("\nLinked list in reverse position is : ");
            while (pointer!=head.back)
            {
                System.out.print(pointer.data+" ");
                pointer=pointer.back;
            }
        }
    }
    public void addAtFirst (int data)
    {
        Node newNode = new Node(data);
        if (head==null)
        {
            System.out.println("List is empty");
            head=tail=newNode;
            head.back=null;
        }
        else
        {
            newNode.next=head;
            head.back=newNode;
            head=newNode;
            newNode.back=null;
        }
    }
    public void addAtLast (int data)
    {
        Node newNode = new Node (data);
        if (head==tail)
        {
            System.out.println("Linked list is empty");
            head=tail=newNode;
            head.back=null;
        }
        else {
            tail.next=newNode;
            newNode.back=tail;
            tail=newNode;
        }
    }
    public void addInMid (int val , int val1)
    {
        Node n1 = searchNode(val);
        Node n2 = searchNode(val1);
        System.out.println("\nEnter data to enter between "+val+" and "+val1+" :");
        int data = input.nextInt();
        Node nodeMid = new Node(data);
        n1.next=nodeMid;
        nodeMid.back=n1;
        nodeMid.next=n2;
        n2.back=nodeMid;
        System.out.println();
    }
    public void remove (int data)
    {
        Node n2 =searchNode(data);
        Node n1=n2.back;
        Node n3= n2.next;
        n1.next=n3;
        n3.back=n1;
        System.out.println();
    }
    public void removeFirst ()
    {
        head.next.back=null;
        head=head.next;
        System.out.println();
    }
    public void removeLast ()
    {
        tail.back.next=null;
        tail=tail.back;
        System.out.println();
    }
    public void sortDescending ()
    {
        Node current=head;
        Node index;
        int temp;
        if (head==null)
        {
            System.out.println("Linked list empty");
            return;
        }
        else
        {
            while (current!=null)
            {
                index=current.next;
                while (index!=null)
                {
                    if (current.data>index.data)
                    {
                        temp=current.data;
                        current.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                current=current.next;
            }
        }
        System.out.println();
    }
}
