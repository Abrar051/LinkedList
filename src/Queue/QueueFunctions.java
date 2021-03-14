package Queue;

public class QueueFunctions {
    public Node head = null;
    public Node tail = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        else
        {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
    public void pop ()
    {
        Node current = head;
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head=head.next;
        }
    }
    public int queueMemberNumber ()
    {
        Node current = head;
        int number=0;
        if (head==null)
        {
            System.out.println("List is empty");
            return 0;
        }
        else
        {
            while (current!=null)
            {
                current=current.next;
                number++;
            }
            return number;
        }
    }
}
