package Stack;

import java.util.*;

public class StackFunction {
    public Node head = null;
    public Node tail = null;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            tail.next = null;
        } else {
            tail.next = newNode;
            tail = newNode;
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

    public void pop() //remove element from last
    {
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        System.out.println("Popped data is " + current.next.data);
        tail = current;
        tail.next = null;
    }

    public void display() {
        Node current = head;
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
