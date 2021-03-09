package CircularLinkedListDouble;

public class Main {
    public static void main (String args[])
    {
        CircularDouble obj = new CircularDouble();
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(6);
        obj.addNode(7);
        obj.addNode(8);
        obj.addNode(9);
        obj.addNode(10);
        obj.addNode(13);
        obj.display();
        //obj.addInMid(6,7);
        //obj.display();
        obj.remove(2);
        obj.remove(13);
        obj.display();
        //obj.traverse();
    }
}
