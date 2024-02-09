/*Create an ArrayList of strings to store the names of fruits. Add at least three different fruits to the list. 
Then, print out the total number of fruits in the list. 
Example 1:
Input : list = [apple, orange]
Output : Total  Number of fruits is 2.

Example 2:
Input : list  = [apple, orange, mango, banana, grapes]
Output : Total  Number of fruits is 5.
*/
package February;

import java.util.ArrayList;

public class Arrayliststring {
    public static void main(String[] args) {
        // Created an arraylist.
        ArrayList<String> list = new ArrayList<>();
        // Added elements in list.
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        // Output
       System.out.println(list.size() + " fruits in the list " + list);
    }
    
}
/*The expected output will be:
 * Input : [Apple,Banana,Mango,Orange]
 * 
 * The expected output will be:
 * 4 fruits in the list [Apple, Banana, Mango, Orange].
 */
