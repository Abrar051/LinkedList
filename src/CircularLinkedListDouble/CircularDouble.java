package CircularLinkedListDouble;
import java.util.*;
public class CircularDouble {
    public Node head = null;
    public Node tail = null;
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
            newNode.next=head;
            head.back=newNode;
            tail=newNode;
        }
    }
    public void display ()
    {
        Node current=head;
        while (current!=tail)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.print(tail.data);
        System.out.println();
    }
    public void traverse ()
    {
        Node current = head;
        Scanner input = new Scanner(System.in);
        label:
        while (true)
        {
            System.out.println("Enter f for forward , b for backward and break for breaking : ");
            String str = input.next();
            switch (str) {
                case "f":
                    current = current.next;
                    System.out.println("1 step forward : " + current.data);
                    break;
                case "b":
                    current = current.back;
                    System.out.println("1 step backward : " + current.data);
                    break;
                case "break":
                    break label;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
