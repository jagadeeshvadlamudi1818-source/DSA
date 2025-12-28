import java.util.*;

public class HashMapDemo {
     public static void main(String[] args) {

        HashMap <String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("nepal", 50);

        System.out.println(hm);
        int population = hm.get("India");
        System.out.println(population);
        
    }
}
