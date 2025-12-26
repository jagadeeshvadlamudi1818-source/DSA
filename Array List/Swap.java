import java.util.ArrayList;
public class Swap {
   public static void Swapx(ArrayList<Integer> List,int idx1,int idx2) {
    int temp=List.get(idx1);
    List.set(idx1,List.get(idx2));
    List.set(idx2,temp);
   } 
   public static void main(String[] args) {
       ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(18);
        List.add(45);
        List.add(7);
        int idx1=1,idx2=2;
        System.out.println(List);
        Swapx(List,idx1,idx2);
        System.out.print(List);
   }
}
