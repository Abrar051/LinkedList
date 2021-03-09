package CircularLinkedList;

public class Main {
    public static void main (String args[])
    {
        CircularList obj = new CircularList();
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(6);
        obj.addNode(7);
        //obj.display();
        obj.traverse();
    }
}
