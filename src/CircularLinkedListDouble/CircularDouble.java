package CircularLinkedListDouble;

import java.util.*;

public class CircularDouble {
    public Node head = null;
    public Node tail = null;
    Scanner input = new Scanner(System.in);

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.back = tail;
            newNode.next = head;
            head.back = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(tail.data);
        System.out.println();
    }

    public Node searchNode(int val) {
        Node pointer = head;
        while (true) {
            if (pointer == null) {
                System.out.println("Empty list");
                return null;
            } else if (pointer.data == val) {
                return pointer;
            }
            pointer = pointer.next;
        }

    }

    public void addInMid(int val, int val1) {
        Node n1 = searchNode(val);
        Node n2 = searchNode(val1);
        System.out.println("Enter data to enter between " + val + " and " + val1 + " : ");
        int data = input.nextInt();
        Node newNode = new Node(data);
        n1.next = newNode;
        newNode.back = n1;
        newNode.next = n2;
        n2.back = newNode;
    }

    public void remove(int data) {
        Node n = searchNode(data);
        if (n == head) {
            head.back.next = head.next;
            head.next.back = head.back;
            head = head.next;
        }

        else if (n==tail)
        {
            tail.back.next = tail.next;
            tail.next.back = tail.back;
            tail = tail.back;
        }

        else {
            n.back.next = n.next;
            n.next.back = n.back;
        }
    }

    public void traverse() {
        Node current = head;
        Scanner input = new Scanner(System.in);
        label:
        while (true) {
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
