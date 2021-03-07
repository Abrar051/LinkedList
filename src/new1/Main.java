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
        obj.addNode(9);
        obj.addNode(12);
        obj.addNode(10);
        obj.addNode(7);
        obj.addNode(11);
        obj.addInMid(6,5);
        obj.addInMid(12,10);
        obj.addFirst(27);
        obj.addLast(26);
        //obj.sortAscendingDisplay();
        obj.display();
        //obj.display();
        //obj.remove(6);
        //obj.remove(2);
        //obj.remove(9);
        //obj.remove(4);
        //obj.display();
    }
}
