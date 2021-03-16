package Queue.Generic;


public class Queue<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public T pop() {
        Node<T> current = head;
        Node<T> previous;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            previous = head;
            head = head.next;
            return previous.data;
        }
    }

    public void push(T data) {
        Node<T> newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void popPrint() {
        System.out.println("Popped data is " + pop());
    }


    public void display() {
        Node<T> current = head;
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
}
