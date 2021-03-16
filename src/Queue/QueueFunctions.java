package Queue;

public class QueueFunctions <T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public void push(T data) {
        Node<T>newNode = new Node(data);
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
    public int pop ()
    {
        Node current = head;
        if (head==null)
        {
            System.out.println("List is empty");
            return 0;
        }
        else
        {
            Node previous = head;
            head=head.next;
            return (int) previous.data;
        }
    }
    public void popPrint ()
    {
        System.out.println("Popped data is "+pop());
    }
    public Object queueMemberNumber ()
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
