package Stack;

public class Main {
    public static void main(String[] args) {
        StackFunction obj = new StackFunction();
        for (int i=1;i<8;i++)
        {
            obj.push(i);
        }
        obj.display();
        System.out.println();
        obj.pop();
        obj.display();
    }
}
