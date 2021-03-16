package Queue.Generic;

public class Stack<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public T pop() {
        Node<T> pointer = head;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            while (pointer.next != tail) {
                pointer = pointer.next;
            }
            tail = pointer;
            tail.next = null;
            return pointer.data;
        }
    }

    public Node<T> searchBeforeTail() {
        Node<T> pointer = head;
        Node<T> previous;
        if (head == null) {
            return null;
        } else {
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            return pointer;
        }
    }

    public Node<T> searchNode(T data) {
        Node<T> pointer = head;
        if (head == null) {
            return null;
        } else {
            while (pointer.data != data) {
                pointer = pointer.next;
            }
            return pointer;
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

    public void display() {
        Node<T> current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
