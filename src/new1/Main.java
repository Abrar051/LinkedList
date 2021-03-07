package new1;

import java.util.Arrays;

public class Main {
    public static void main (String args[])
    {
        LinkedListFunc obj = new LinkedListFunc();
        obj.addNode(2);
        obj.addNode(4);
        obj.addNode(6);
        obj.addNode(5);
        obj.forwardDisplay(6);
        obj.addNode(9);
        obj.display();
        System.out.println(obj.findNode(100));
        System.out.println(obj.findNode(104));
        obj.remove(6);
        obj.remove(2);
        obj.remove(9);
        obj.remove(4);
        obj.display();
    }
}
