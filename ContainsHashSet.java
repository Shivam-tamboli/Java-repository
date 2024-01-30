import java.util.HashSet;
import java.util.Iterator;


public class ContainsHashSet {
    public static void main(String[] args) {
        // Created a hashset.
        HashSet<Integer> Set = new HashSet<>();
        // Added numbers in hash set.
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);

        // Removed numbers in hash set.
        Set.remove(3);

        // After removing element in hash set.
        System.out.println(Set);

        //  Checking the number is existed or not.
        if(Set.contains(2)){
            System.out.println("It contains:");
        }
        
        //  Checking the number is existed or not.
        if(!Set.contains(5)){
            System.out.println("It does not contains");
        }
        // Printing the size of set.
        System.out.println("Set of size is " + Set.size());

        // Iterator in hash set.
        Iterator it = Set.iterator();

        // it willl iterate all the elements are present in hashset.
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

    }
    
}
/*The expected output will be:
After removing the elements.
 * [1, 2, 4]
 * It contains the number.
It contains:
It does not contains the element in hash set.
It does not contains
Iterator will show the  following values in hashset.
1
2
4
 */
