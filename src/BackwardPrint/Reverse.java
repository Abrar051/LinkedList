package BackwardPrint;

public class Reverse {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void display() {
        Node counter = head;
        while (counter != null) {
            System.out.print(counter.data + " ");
            counter = counter.next;
        }
        System.out.println();
    }

    /*public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }*/

    public void reverseNode() {
        Node newHead = null;
        Node current = head;
        while (current != null) {
            Node temp = current.next;
            current.next = newHead;
            newHead = current;
            current = temp;
        }
        head = newHead;
    }

    public void reverse() {
        //head = reverseNode(head);
    }
}
