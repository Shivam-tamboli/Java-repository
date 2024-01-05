import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twosum(int[] nums , int target){

        // Create a HashMap
        Map<Integer, Integer> map = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++) {
    
          // Get the complement using the target value
          int complement = target - nums[i];
    
          // Search the hashmap for complement, if found, we got our pair
          if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
          }
    
          // Put the element in hashmap for subsequent searches.
          map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
      }
    public static void main(String[] args) {
        int[] nums = {16,4,23,8,15,42,1,2};
        int target = 3;
        int[] result = twosum(nums, target);

        // Print each element of the result array separately
        System.out.println("Indices of the two numbers that sum up to the target: " + result[0] + ", " + result[1]);

    }
   
    
}
