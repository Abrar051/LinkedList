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
        obj.addNode(22);
        obj.addNode(17);
        obj.display();
        obj.addAtFirst(50);
        obj.addAtLast(100);
        obj.addInMid(2,3);
        obj.addInMid(17,100);
        obj.traverse();
        obj.display();
        obj.remove(8);
        obj.remove(9);
        obj.addAtLast(200);
        obj.display();
        obj.removeFirst();
        obj.removeLast();
        obj.display();
        obj.reverseDisplay();
        obj.sortDescending();
        obj.display();
    }
}
