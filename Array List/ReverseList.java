import java.util.ArrayList;
public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(18);
        List.add(45);
        List.add(7);
        for(int i=List.size()-1;i>=0;i--) {
         System.out.print(List.get(i)+" ");
        }
       System.out.println();
        
    }
}
