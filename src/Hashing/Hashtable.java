package Hashing;

import java.util.*;
class Hashtable1{
    public static void main(String args[]){
        Hashtable<Integer,String> hm=new Hashtable<Integer,String>();

        hm.put(100,"sentence 1");
        hm.put(102,"sentence 2");
        hm.put(101,"sentence 3");
        hm.put(103,"sentence 4 ");

        System.out.println(hm);
    }
}