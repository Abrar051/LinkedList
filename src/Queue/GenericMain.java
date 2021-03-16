package Queue;

public class GenericMain {

    public static void main(String[] args) {
        GenericBasedFunction obj = new GenericBasedFunction();
        obj.push(2);
        obj.push(5);
        obj.push('c');
        obj.push(7);
        obj.push(8);
        obj.display();
    }
}
