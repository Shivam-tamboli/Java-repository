package August;
import java.util.*;

public class Arraylist {

    // add
    public static void solutionint(ArrayList<Integer> list){
        list.add(0);
        list.add(1);
        list.add(2);
    }

    // get
    public static Integer solutiongt(ArrayList<Integer> list){
        if(list.size() > 2){
            return list.get(2);
        }else{
            throw new IndexOutOfBoundsException("");
        }
    }

    // add elements between elements
    public static void solutionBet(ArrayList<Integer> list){
        list.add(1 , 3);

    }

    // set
    public static void solutionset(ArrayList <Integer> list){
        list.set(2, 5);
    }

    public static void main(String[] args) {
        // Arraylist
        ArrayList<Integer> list = new ArrayList<>();

        solutionint(list);
        System.out.println(list);

       

    try{
        int result = solutiongt(list);
        System.out.println(result);
    }catch (IndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }

solutionBet(list);
System.out.println(list);

solutionset(list);
System.out.println(list);


Collections.sort(list);
System.out.println(list);
    }
    
}
