package class1027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class mainClass {

    public static void main(String[] args) {
        
        // ArrayList<Integer> myList = new ArrayList<Integer>();
        // HashSet<Integer> mySet = new HashSet<Integer>();
        
        // for(int i  = 0; i < 10000000; i++){
        //     myList.add(i);
        //     mySet.add(i);
        // }
        
        // long t0 = System.currentTimeMillis();
        // myList.contains(10000000);
        // long t1 = System.currentTimeMillis();
        // //System.out.println(myList.size());
        // long duration = t1 -t0;
        // System.out.println("Time to look up value in ArrayLists: " + duration);

        // long t2 = System.currentTimeMillis();
        // mySet.contains(10000000);
        // long t3 = System.currentTimeMillis();
        // //System.out.println(myList.size());
        // long duration2 = t3-t2;
        // System.out.println("Time to look up value in Set: " + duration2);
        
        //System.out.println(myList.contains(50));
        //returns boolean response (true/false)
        // * goes through the array and checks to see if it contains the value
    
            HashMap<Integer, String> myMap = new HashMap<Integer, String>();

            myMap.put(1, "One");
            myMap.put(2, "Two");
            System.out.println(myMap.get(1)); //gets the value of one

            
    }
}
