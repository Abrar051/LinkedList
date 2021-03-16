package Queue.Generic;

import java.util.Arrays;

public class ArrayStack<T>{
    T[] arr = (T[]) new Object[1];


    public int getLength() {
        return this.arr.length;
    }

    public void push(T data) {
        arr[arr.length - 1] = data;
        arr = (T[]) Arrays.copyOf(arr, arr.length + 1);
    }

    public T pop ()
    {
        T oldEnd=arr[this.arr.length-1];
        arr[this.arr.length-1]=null;
        arr=Arrays.copyOf(arr,this.arr.length-1);
        return oldEnd;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray length is : "+this.arr.length);
    }
}
