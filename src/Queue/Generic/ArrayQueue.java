package Queue.Generic;

import java.util.Arrays;

public class ArrayQueue<T> {
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
        T temp,oldHead;
        oldHead=arr[0];
        if (arr[0]==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            for (int i=0;i<this.arr.length-1;i++)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            arr[this.arr.length-1]=null;
            arr=Arrays.copyOf(arr,this.arr.length-1);
        }
        return oldHead;
    }

    public void printArray() {
        System.out.println();
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray length is : "+this.arr.length);
    }
}
