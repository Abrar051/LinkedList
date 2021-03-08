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
        obj.addAtFirst(50);
        obj.addAtLast(100);
        obj.addInMid(2,3);
        obj.addInMid(9,10);
        obj.display();
        obj.remove(8);
        obj.removeFirst();
        obj.display();
        obj.reverseDisplay();
    }
}
