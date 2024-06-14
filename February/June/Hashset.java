package February.June;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // Created a hashset.
        HashSet<Integer> Set = new HashSet<>();
        // Adding elements in hashset.
        Set.add(4);
        Set.add(8);
        Set.add(5);

        // Checking it contains elements or not.
        if(Set.contains(8)){
            System.out.println("It contains");
        }
        if(!Set.contains(9)){
            System.out.println("It does not contains");
        }
        Set.remove(4);
        // Printing Set.
        System.out.println(Set);
    }
    
}
