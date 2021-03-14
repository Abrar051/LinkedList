package Queue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        QueueFunctions obj = new QueueFunctions();
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            obj.push(i);
        }
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.display();
        System.out.println("Number of members in queue is "+obj.queueMemberNumber());
    }
}
