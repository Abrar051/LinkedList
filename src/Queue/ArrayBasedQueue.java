package Queue;

import java.util.Arrays;

public class ArrayBasedQueue {
    public int[] array = new int[0];


    public void push(int data) {
        int newSize = this.array.length + 1;
        array = Arrays.copyOf(array, newSize);
        array[this.array.length - 1] = data;
    }

    public void add (int data , int position)
    {
        
    }
    public void pop ()
    {
        int newSize = this.array.length-1;
        if (this.array.length==0)
        {
            System.out.println("Array is empty");
        }
        else
        {
            int temp;
            for (int i=0;i<this.array.length-1;i++)
            {
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
            this.array=Arrays.copyOf(array,newSize);
        }
    }

    public void display() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
    }
}
