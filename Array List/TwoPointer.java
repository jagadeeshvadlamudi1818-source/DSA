
import java.util.*;

public class TwoPointer {

    public static int StoreWater(ArrayList<Integer> height) {
        int MaxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int CurrWater = ht * width;
            MaxWater = Math.max(MaxWater, CurrWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoreWater(height));
    }
}
