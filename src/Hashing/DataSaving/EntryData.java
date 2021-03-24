package Hashing.DataSaving;

import java.util.*;

public class EntryData {
    public static void main(String[] args) {
        Map<Integer,Book> library= new Hashtable<Integer,Book>();
        Scanner input = new Scanner(System.in);
        Book b1 = new Book(1,"Arthur","Brief history 1","abc1");
        Book b2 = new Book(2,"Arthur1","Brief history 2","abc2");
        Book b3 = new Book(3,"Arthur2","Brief history 3","abc3");
        Book b4 = new Book(4,"Arthur3","Brief history 4","abc4");
        Book b5 = new Book(5,"Arthur4","Brief history 5","abc5");
        library.put(1,b1);
        library.put(2,b2);
        library.put(3,b3);
        library.put(4,b4);
        library.put(5,b5);
        System.out.print("Enter key to get info : ");
        int index = input.nextInt();
        System.out.println("Author : "+library.get(index).author+ " ||  Name : "+library.get(index).name+ " || Publisher : "+library.get(index).publisher);
    }
}