package Stack;

public class Main {
    public static void main(String[] args) {
        StackFunction obj = new StackFunction();
        for (int i=1;i<8;i++)
        {
            obj.push(i);
        }
        obj.display();
        obj.pop();
        obj.display();
        obj.push2(9);
        obj.display();
        obj.pop2();
        obj.display();
        obj.pop2();
        obj.display();
    }
}
