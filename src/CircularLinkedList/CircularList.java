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
            tail=newNode;
            newNode.next=head;
        }
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
    public void traverse ()
    {
        Node counter=head;
        Node backWard = head;
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