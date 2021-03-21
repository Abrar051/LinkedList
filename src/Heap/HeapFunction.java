package Heap;

import java.util.*;

public class HeapFunction {
    //functions related with array
    public int array[] = new int[1];

    public void add(int data) {
        array[array.length - 1] = data;
        array = Arrays.copyOf(array, array.length+1);
    }

    public void arrayCompress ()
    {
        array=Arrays.copyOf(array,array.length-1);
    }

    public void display() {
        if (array.length == 0) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(this.array[i] + " ");
            }
        }
        System.out.println();
    }

    public int[] createHeap() {
        int temp, k;
        for (int i = 2; i < array.length; i++) {
            temp = array[i];
            k = i;
            while (k > 0 & array[k / 2] > temp) {
                array[k] = array[k / 2];
                k = k / 2;
            }
            array[k] = temp;
        }
        return array;
    }

    public void deleteMax() {
        sort();
        arrayCompress();
    }

    public void sort() {
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapConvert(array.length, i);
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapConvert(i, 0);
        }
    }

    void heapConvert(int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l] > array[largest])
            largest = l;

        if (r < n && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            heapConvert(n, largest);
        }
    }

    public void printArray() {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}
