package Queue.Generic;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericBasedFunction <Integer> obj = new GenericBasedFunction<Integer> ();
        for (int i=0;i<10;i++)
        {
            obj.push(i);
        }
        obj.push(12);
        obj.display();
        obj.popPrint();
        obj.popPrint();
        obj.display();
    }
}
