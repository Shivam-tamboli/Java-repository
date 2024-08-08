/*  NeetCode

 Duplicate Integer
 
 Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
 
 Example 1:

Input: nums = [1, 2, 3, 3]

Output: true
 */

package June;
import java.util.*;

public class Duplicateinteger {

    public static boolean solution(int[] nums){
        // Created a hashset.
        HashSet<Integer> Set = new HashSet<>();
        // forloop for iterating over the elements.
        for(int num : nums){
            // Condition if it contains num, it will return true.
           if(Set.contains(num))
            return true;
            // Otherwise it will add in hashset.
            Set.add(num);
            
           }
        // It returns flase.
           return false;

        }
        

    
    public static void main(String[] args) {
        // Created an array.
        int nums[] = {1, 2, 3, 5, 6, 1};
        // Called a method 
        System.out.println(solution(nums));

        

        
    }
}
/*The expected input will be:
 * int nums[] = {1, 2, 3, 5, 6, 1};
 * 
 * The expected output will be:
 * true
 */

