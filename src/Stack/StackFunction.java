package Stack;

import java.util.*;

public class StackFunction {
    public Node head = null;
    public Node tail = null;

    public void push(int data) {     //this push is done from tail and head stays in root
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void push2 (int data)   //push from head
    {
        Node newNode = new Node (data);
        if (head==null)
        {
            head=tail=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
    }

    public Node searchNode(int data) {
        Node current = head;
        while (true) {
            if (head == null) {
                System.out.println("list is empty");
                return null;
            } else if (current.data == data) {
                return current;
            }
            current = current.next;
        }
    }

    public void pop() //remove element from tail
    {
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        System.out.println("Popped data is " + current.next.data);
        tail = current;
        tail.next = null;
    }

    public void pop2 () //start pop from head
    {
        if (head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            head=head.next;
        }
    }
    public void display() {
        Node current = head;
        System.out.println();
        while (true) {
            if (current == null) {
                break;
            } else {
                System.out.print(current.data + " ");
            }
            current = current.next;
        }

    }
}
