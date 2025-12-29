


import java.util.*;
public class HashMapDemo {
     public static void main(String[] args) {
        TreeMap <String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal", 50);
        tm.put("US",5);
      

        HashMap <String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 5);
        hm.put("US",50);
         System.out.println(hm);
         System.out.println(tm);
        // int population = hm.get("India");
        // System.out.println(population);
        //containskey - O(1)
        // System.out.println(hm.containsKey("India"));
        //  System.out.println(hm.containsKey("Sri Lankha"));
          //remove 
        //   System.out.println(hm.remove("India"));
        //   System.out.println(hm);
        //   System.out.println(hm.size());
        //   hm.clear();
        //   System.out.println(hm.isEmpty());
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);
        // for(String k : keys) {
        //     System.out.println("keys="+k+",value="+hm.get(k));
        // }


    }
}
