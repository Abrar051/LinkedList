package Queue;

public class Node<T> {
    Node next;
    T data;
    Node (T data)
    {
        this.data=data;
        this.next=null;
    }
}
