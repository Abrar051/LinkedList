package Hashing;

import java.util.*;

    class GFG {


        static void createHashMap(int arr[])
        {
            // Creates an empty HashMap
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            // Traverse through the given array
            for (int i = 0; i < arr.length; i++) {


                Integer c = map.get(arr[i]);
                if (map.get(arr[i]) == null) {
                    map.put(arr[i], 1);
                }

                // If elements already exists in hash map
                // Increment the count of element by 1
                else {
                    map.put(arr[i], ++c);
                }
            }

            // Print HashMap
            System.out.println(map);
        }
        public static void main(String args[]) {
            Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
            hm.put(2, "two");
            hm.put(3, "three");
            hm.put(4, "four");
            hm.put(5, "five");
            System.out.println(hm);
            hm.remove(3);
            System.out.println(hm);
            System.out.println(hm.getOrDefault(1,"Not found"));
            System.out.println(hm.getOrDefault(3,"Found it"));
            hm.putIfAbsent(6,"six");
            System.out.println(hm);
        }
    }