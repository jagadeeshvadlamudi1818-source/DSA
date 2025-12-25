
import java.util.ArrayList;
public class ArrayListt {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<Integer>(); 
      
      list.add(18);
      list.add(99);
      list.add(7);
      System.out.println(list);
      int element=list.get(2);
      System.out.println(element);

      list.add(3,1);
      System.out.println(list);
      list.add(1,45);
      System.out.println(list);
      list.remove(3);
      System.out.println(list);
      int size=list.size();
      System.out.println(size);
      for(int i=0;i<list.size();i++) {
      System.out.print(list.get(i));
      } 
      System.out.println();
   }
}
