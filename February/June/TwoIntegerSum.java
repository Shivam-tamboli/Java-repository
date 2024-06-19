// NeetCode
/*Two Integer Sum
 * Given an array of integers nums and an integer target,
 *  return the indices i and j such that nums[i] + nums[j] == target and i != j.
 */
/*
 * Example 1:
 * Input :
 * int nums = {1,2,3,4,5};
 * int target = {9}
 * Output:
 * [3,4]
 * 
 * Example 2:
 * Input:
 * int nums = {1,2,4,5,6,7}
 * int target = {3}
 * Output:
 * [0,1]
 */

    package February.June;

    import java.util.*;

    public class TwoIntegerSum {
    // Created a method with parameters.
        public static int[] solution(int[] nums, int target) {
            // Created a hashmap.
            HashMap<Integer, Integer> map = new HashMap<>();
            // For loop for iterating over all elements.
            for (int i = 0; i < nums.length; i++) {
                // finding complement.
                int complement = target - nums[i];
                // if map contains the component it will return the indices of nums.
                if (map.containsKey(complement)) {
                    // it is returning the indices of the two numbers that add up to the target.
                    // int[] this method return the indices and the indices will be return in an array.
                    return new int[]{map.get(complement), i};
                }
                // we will put the value along with the index.
                map.put(nums[i], i);
            }
            // After iterating from all elements it could not find the the pair of indices.
            throw new IllegalArgumentException("No two sum solution");
        }

        public static void main(String[] args) {
            // Created an array.
            int[] nums = {1, 2, 4, 5, 6, 7};
            // target value.
            int target = 3;
            // In the result the method and parameters were passed.
            int[] result = solution(nums, target);
            // Called the result.
            System.out.println(Arrays.toString(result)); // Output: [0, 2]
        }
    }

    /*The expected input will be  
     * int[] nums = {1, 2, 4, 5, 6, 7};
     * 
     * The expected output will be:
     * [0, 1]
    */