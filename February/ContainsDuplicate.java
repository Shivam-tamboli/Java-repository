/*Given an integer array nums, return true if any value appears at least twice in the array, 
and return false if every element is distinct.

Example : 1
Input : nums = {1,2,3,2,7,8,9}
Output: True

Example : 2
Input : nums = {1,2,3,4,5,6,7,8}
Output: False.
*/
package February;

import java.util.HashSet;
// Created a class.
class solution{
    // Created a function.
    public boolean containsduplicate(int[] nums) {
        // Created a hashset,this data structures stores only unique elements.
        HashSet<Integer> set = new HashSet<>();
        // Using for loop,iterating over the array.
        for(int num : nums){
            // Uisng if statements,checking if elements exist in the set or not.
            if(set.contains(num))
            return true; /*if exist it will return true. */
            // If it does not exist then it will add in hashset.
            set.add(num);   
        }
        // If the every element is unique then it will return false.
        return false;
    }
}
public class Containsduplicate {
    public static void main(String[] args) {
        // Created an array.
        int[] nums = {1,2,3,4,5,6,7,1};
        // Creaed object for calling the function.
        solution sol = new solution();
        // Output.
        System.out.println(sol.containsduplicate(nums));
       
    }
    
}
/*The expected input will be:
 * nums = {1,2,3,4,5,6,7,1};
 * 
 * The expected output will be:
 * true
 */
