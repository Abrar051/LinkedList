public class Main {
    public static void main (String args[])
    {
        SingleLinkedList obj = new SingleLinkedList();
        obj.addNode(1);
        obj.addNode(2);
        obj.addNode(3);
        obj.addInMid(6);
        obj.addNode(4);
        obj.addNode(5);
        obj.addNode(7,4);
        obj.display();
        obj.forwardDisplay();
        obj.forwardDisplay();
        obj.forwardDisplay();
        obj.backwardDisplay();
        obj.backwardDisplay();
        obj.remove(3);
        //obj.remove(2);
        //obj.remove(1);
        //obj.remove(5);
        obj.display();
        obj.reverseDisplay(obj.tail);
    }
}
