package Queue.Generic;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();
        Stack<Integer> integerStack = new Stack<>();
        ArrayQueue<Integer> integerArrayQueue = new ArrayQueue<>();
        ArrayStack<Integer> integerArrayStack = new ArrayStack<>();
        for (int i=0;i<5;i++)
        {
            integerQueue.push(i);
        }
        for (int i=0;i<5;i++)
        {
            integerStack.push(i);
        }
        System.out.println("Popped data from queue is : "+integerQueue.pop());
        System.out.println("Popped data from queue is : "+integerQueue.pop());
        System.out.println("Popped data from queue is : "+integerQueue.pop());
        integerQueue.display();
        integerStack.display();
        System.out.println("Popped data from stack is : "+integerStack.pop());
        System.out.println("Popped data from stack is : "+integerStack.pop());
        System.out.println("Popped data from stack is : "+integerStack.pop());
        System.out.println("Popped data from stack is : "+integerStack.pop());

        //Array queue

        for (int i =0;i<5;i++)
        {
            integerArrayQueue.push(i);
            integerArrayStack.push(i);
        }
        integerArrayQueue.printArray();
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        System.out.println("Popped data is : "+integerArrayQueue.pop());
        integerArrayQueue.printArray();

        //Array stack

        integerArrayStack.printArray();
        System.out.println("Popped data is : "+integerArrayStack.pop());
        System.out.println("Popped data is : "+integerArrayStack.pop());
        System.out.println("Popped data is : "+integerArrayStack.pop());
        System.out.println("Popped data is : "+integerArrayStack.pop());
        System.out.println("Popped data is : "+integerArrayStack.pop());
        System.out.println("Popped data is : "+integerArrayStack.pop());
        integerArrayStack.printArray();


    }
}
