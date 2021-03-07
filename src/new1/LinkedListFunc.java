package new1;

public class LinkedListFunc {
    public Node head = null;
    public Node tail = null;


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
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void forwardDisplay (int val)
    {
        Node pointer = findNode(val).next;
        System.out.println(pointer.data);
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

}
