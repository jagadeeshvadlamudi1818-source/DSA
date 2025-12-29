import java.util.ArrayList;

public class MultiList {
      public static void main(String[] args) {
      ArrayList<ArrayList<Integer>>MainList = new ArrayList<>();
     // ArrayList<Integer> List = new ArrayList<Integer>();
    //   List.add(1);
    //     List.add(2);
    //    MainList.add(List);
    //   ArrayList<Integer> List2 = new ArrayList<Integer>();
    //   List2.add(3);List2.add(4);
    //   MainList.add(List2);
    //    for(int i=0;i<MainList.size();i++) {
    //     ArrayList<Integer> currList = MainList.get(i);
    //     for(int j=0; j<currList.size();j++) {
         // System.out.print(currList.get(j)+" ");
       // }
        //System.out.println();
        
      // }
      // System.out.println(MainList);    
       ArrayList<Integer> List1 = new ArrayList<Integer>();
       ArrayList<Integer> List2 = new ArrayList<Integer>();
       ArrayList<Integer> List3 = new ArrayList<Integer>();
       for(int i=1;i<=5;i++) {
        List1.add(i*1);
        List2.add(i*2);
        List3.add(i*3);
       }
        MainList.add(List1);
        MainList.add(List2);
        MainList.add(List3);
     System.out.println(MainList);
     for(int i=0;i<MainList.size();i++) {
      ArrayList<Integer> currList = MainList.get(i);
      for(int j=0; j<currList.size();j++) {
          System.out.print(currList.get(j)+"  ");
        }
      System.out.println(); 
      }
     }
    }
   // }
  

