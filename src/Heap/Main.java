package Heap;

public class Main {
    public static void main(String[] args) {
        HeapFunction heapFunction = new HeapFunction();
        HeapFunction heapFunction1 = new HeapFunction();
        //input 45 28 52 25 60 70
        heapFunction.add(45);
        heapFunction.add(28);
        heapFunction.add(52);
        heapFunction.add(25);
        heapFunction.add(60);
        heapFunction.add(70);
        heapFunction.printArray();

        heapFunction1.add(28);
        heapFunction1.add(45);
        heapFunction1.add(52);
        heapFunction1.add(60);
        heapFunction1.add(25);
        heapFunction1.add(70);

        heapFunction1.printArray();


        heapFunction.createHeap();
        heapFunction1.createHeap();


        heapFunction.printArray();
        heapFunction1.printArray();


        heapFunction.sort();
        heapFunction1.sort();
        heapFunction.printArray();
        heapFunction1.printArray();
        heapFunction.deleteMax();
        heapFunction.printArray();
    }
}
