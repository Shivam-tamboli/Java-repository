/*Given an integer array nums and a target integer target, write a Java method 
findFirstOccurrence to return the index of the first occurrence of target in nums.
 If target is not found in nums, return -1.


Example : 
int[] nums = {4, 2, 5, 1, 8, 6, 9, 7, 5};
int target = 5;

Output: 
First occurrence of 5 found at index: 2



 */
package July;

import java.util.*;

public class findFirstOccurrenceArray {
    public static int solution(int[] nums , int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    

    
    public static void main(String[] args) {
        int[] nums = {4,3,5,2,6,2,1,7};
        int target = 2;
        int index = solution(nums, target);
        System.out.println("First occurance index of "+ target +  " is " +  index);
        
    }
    
}
/*The expected input will be:
 * Input :
 * int[] nums = {4,3,5,2,6,2,1,7};
    int target = 2;

    Output : 
    First occurance index of 2 is 3
 *  
 */