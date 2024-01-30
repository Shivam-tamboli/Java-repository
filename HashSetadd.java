/*
 * Create a hash set and add elements to it and print the elements of hash set.
 * 
 * Example 1:
 * Numbers added to the hash set.
 * The name of set is a name  hash set.
 * Input 1: set = [1,2,3,]
 * The elements are presents in hash set.
 * Output = [1,2,3]
 * 
 */


import java.util.HashSet;

public class HashSetadd {
    public static void main(String[] args) {
        // Created a hash set.
        HashSet<Integer> Set = new HashSet<>();

        // Adding numbers into the  hash set. 
        Set.add(100);
        Set.add(200);
        Set.add(300);

        // Printing the elements of  hash set.
        System.out.println(Set);
        

    }
    
}

/*
 * The expected input will be:
 * 10
 * 20
 * 30
 * 
 * The expected output will be:
 * [20, 10, 30]
 * 
 * The expected input will be:
 * 100
 * 200
 * 300
 *  The expected output will be:
 * [100, 200, 300]
 */
