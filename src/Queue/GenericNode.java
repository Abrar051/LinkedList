package Queue;

public class GenericNode<T> {
    GenericNode next;
    T data;
    GenericNode(T data)
    {
        this.data=data;
        this.next=null;
    }
}
