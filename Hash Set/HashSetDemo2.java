import java.util.*;

public class HashSetDemo2 {
    public static void main(String[] args) {
     int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<num.length; i++) {
            hs.add(num[i]);
        }
        System.out.println("ANS =" +hs.size());

        // hs.add("Delhi");
        // hs.add("Mumbai");
        // hs.add("Chennai");
        // hs.add("Vizag");
        //  TreeSet<String> ts = new TreeSet<>();
         
        // ts.add("Delhi");
        // ts.add("Mumbai");
        // ts.add("Chennai");
        // ts.add("Vizag");

        // Iterator it = hs.iterator();

        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }
    //     for(String city : hs) {
    //    System.out.println(city);            
    //     }
    // System.out.println(hs);
    // System.out.println(ts);

   
    }
}
