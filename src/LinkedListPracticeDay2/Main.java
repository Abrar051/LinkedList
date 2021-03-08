package LinkedListPracticeDay2;

public class Main {
    public static void main (String args[])
    {
        DoubleLinkedList obj = new DoubleLinkedList();
        //5 data adding
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(8);
        obj.addNode(9);
        obj.addNode(10);
        obj.display();
        System.out.println();
        obj.reverseDisplay();
    }
}
