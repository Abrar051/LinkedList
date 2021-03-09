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
        obj.display();
        obj.reverse();
        obj.display();
    }
}
