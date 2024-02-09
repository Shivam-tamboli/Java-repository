/* Write a program to create an ArrayList of characters and add the letters 'a', 'b', 'c', 'd', and 'e' to the list. 
Then, remove the letter 'c' from the ArrayList and print out the remaining elements.
Example 1:
Input : list = [q,w,c,r,t,y]
Output : [q,w,r,t,y]

Example 2:
Input : list = [q,a,z,c,w,s]
Output :[q,a,z,w,s]

*/
package February;

import java.util.ArrayList;

public class Arraylistremaningelements {
    public static void main(String[] args) {
        // Created an array list.
        ArrayList<String> list = new ArrayList<>();
        // Added elements into the array list.
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println( "Befor removing element:");
        // Befor removing element from the list.
        System.out.println(list);
        // Removing elements form the list.
        list.remove("c");
        // After removing element
        System.out.println("After removing element:");
        // Output.
        System.out.println(list);

        
    }
    
}
/*The expected output will be :
 list : [a,b,c,d,e]
 
 The expected output will be:
 Befor removing element:
[a, b, c, d, e]
After removing element:
[a, b, d, e]
 */