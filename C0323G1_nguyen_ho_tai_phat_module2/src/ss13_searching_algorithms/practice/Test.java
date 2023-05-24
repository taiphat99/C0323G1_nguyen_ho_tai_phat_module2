package ss13_searching_algorithms.practice;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> c03HashMap = new HashMap<>();
        c03HashMap.put ( 3,  "Phat");
        c03HashMap.put ( 1,  "Quyên");
        c03HashMap.put (2, "Quân");
        c03HashMap.put (null,"No Body");
        c03HashMap.put (null, "No One");
        System.out.println(c03HashMap.get (1)); // Map.getKey () => value
        Set <Integer> keySet = c03HashMap. keySet ();
        for (Integer key : keySet) {
            System.out.println("Key: " + key + ", value: " + c03HashMap.get (key));
        }
    }
}
