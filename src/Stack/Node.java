package Stack;

public class Node {
    Node next;
    int data;
    char obj;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
    Node (char str)
    {
        this.obj=str;
        this.next=null;
    }
}
