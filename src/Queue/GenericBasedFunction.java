package Queue;

import java.util.LinkedList;

public class GenericBasedFunction {
    public GenericNode head = null;
    public GenericNode tail = null;

    public Object pop() {
        GenericNode<Object> current = head;
        GenericNode<Object> previous;
        if (head == null) {
            System.out.println("List is empty");
            return null;
        } else {
            previous = head;
            head = head.next;
            return previous.data;
        }
    }

    public void push(Object data) {
        GenericNode<Object> newNode = new GenericNode<Object>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail = newNode;
        }
        tail.next = null;
    }

    public void display() {
        GenericNode<Object> current = head;

            while (current != null) {
                System.out.print(current.data + " ");
                current=current.next;
        }
        System.out.println();
    }
}
