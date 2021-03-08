package new1;
import java.util.*;
public class LinkedListFunc {
    public Node head = null;
    public Node tail = null;
    Scanner input = new Scanner(System.in);
    public Node findNode(int val) {
        Node pointer =head;
        while (true)
        {
            if (pointer.data==val)
            {
                return pointer;
            }
            else if (pointer.next==null)
            {
                System.out.println("List ended");
                break;
            }
            pointer=pointer.next;
        }
        System.out.println("No match found for "+val);
        return null;
    }
    public Node findPrevious (int data)
    {
        Node pointer = head;
        while (true)
        {
            if (pointer.data==data)
                return null;
            else if (pointer.next.data==data)
                return pointer;
            pointer=pointer.next;
        }
    }

    public void remove (int data)
    {
        Node n = findPrevious(data);
        if (n==null)
        {
            head=head.next;
        }
        else
        {
            n.next=n.next.next;
        }
    }

    public void addNode(int data) {
        Node newNode = createNode(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public Node createNode (int data)
    {
        Node newNode = new Node(data);
        return newNode;
    }

    public void removeFirst ()
    {
        Node temp;
        if (head==null)
            System.out.println("List is empty");
        else
        {
            temp=head.next;
            head=temp;
        }
    }
    public void removeLast ()
    {
        Node pointer=head;
        if (tail==head )
            System.out.println("Empty list");
        else
        {
            while(pointer!=null)
            {
                if (pointer.next==tail)
                {
                    System.out.println(pointer.data+" ");
                    tail=pointer;
                    tail.next=null;
                    break;
                }
                pointer=pointer.next;
            }
        }
    }
    public void backwardDisplay (int val)
    {
        Node pointer = head;
        while (true)
        {
            if (pointer.data==val)
                System.out.println("null");
            else if (pointer.next.data==val)
                System.out.println(pointer.next.data);;
            pointer=pointer.next;
        }
    }
    public void backWardDisplay (int val)
    {
        Node pointer = findPrevious(val);
        if (pointer==head)
        {
            System.out.println("Null");
        }
        else
        {
            System.out.println(pointer.data);
        }

    }
    public void display ()
    {
        Node current = head;
        while (true)
        {
            if (current==null)
            {
                break;
            }
            else
            {
                System.out.print(current.data+" ");
            }
            current=current.next;
        }
        System.out.println();
    }


    public void swap (Node a , Node b)
    {
        int temp;
        if (a.data>b.data)
        {
            temp=a.data;
            a.data= b.data;
            b.data=temp;
        }
    }
    public void nodeSwap (Node a , Node b)
    {
        Node temp;
        temp = a;
        a=b;
        b=temp;
    }
    public void addInMid (int val1 , int val2)
    {
        System.out.print("Enter data to enter between "+val1+" and "+val2+" : ");
        int data = input.nextInt();
        Node n = new Node(data);
        Node n1 = findNode(val1);
        System.out.println(n1.data);
        Node n2 = findNode(val2);
        System.out.println(n2.data);
        n1.next=n;
        n.next=n2;
    }

    public void addFirst (int data)
    {
        Node n1=head;
        Node temp;
        Node newNode = new Node(data);
        if (head==null)
            System.out.println("No item in list");
        else
        {
            temp=head;
            head=newNode;
            newNode.next=temp;
        }
    }

    public void addLast (int data)
    {
        Node n1=tail;
        Node newNode = new Node(data);
        if (tail==null)
            System.out.println("No item in the list");
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void sortAscendingDisplay ()
    {
        Node current = head, index = null;
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                index = current.next;
                while(index != null) {
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

}
