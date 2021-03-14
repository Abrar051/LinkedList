package Queue;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayBasedQueue obj = new ArrayBasedQueue();
        obj.push(0);
        obj.push(5);
        obj.push(7);
        obj.push(10);
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
    }
}
