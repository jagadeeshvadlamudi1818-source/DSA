import java.util.*;
    public class MaximumElement {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(18);
        List.add(45);
        List.add(7);
       int max=Integer.MIN_VALUE;
       for(int i=0;i<List.size();i++) {
        if(max<List.get(i)) {
            max=List.get(i);
        }
       }
        System.out.print(max);
    }
}


