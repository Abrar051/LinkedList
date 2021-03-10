package BackwardPrint;

public class Main {
    public static void main (String args[])
    {
        Reverse obj = new Reverse();
        obj.addNode(2);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(5);
        obj.addNode(6);
        obj.addNode(9);
        obj.addNode(14);
        obj.display();
        obj.reverseNode();
        obj.display();
    }
}
