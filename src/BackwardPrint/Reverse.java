package BackwardPrint;

public class Reverse {
    public Node head = null;
    public Node tail = null;
    public void addNode (int data)
    {
       Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void display ()
    {
        Node counter=head;
        while (counter!=null)
        {
            System.out.print(counter.data+" ");
            counter=counter.next;
        }
        System.out.println();
    }
    public void reverse ()
    {
        //step at first break list from last
        //then make another list whose head will start from tail last
        Node current = head;
        Node previous = null;
        Node next = current.next;
        while (current!=null)
        {
            /*next=current.next;
            current.next=prev;
            prev=current;
            current=next;*/
            previous=current.next;
            head=next;
        }
    }
}
