import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        // Created a hashset for storing integers.
        Set<Integer> intSet = new HashSet<>();
        // Using for loop 
        for (int num : nums){
            // Using if statemnt for checking the duplicates.
            // if any duplicates are there it will return true.
            if(intSet.contains(num)){
                return true;
            }
            // Add number to the hash set
            intSet.add(num);

        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        // Example 1: Array with duplicates
        int[] nums1 = {1, 2, 3, 4, 5, 1};
        System.out.println( containsDuplicate.containsDuplicate(nums1));

        // Example 2: Array without duplicates
        int[] nums2 = {5, 8, 12, 3, 9};
        System.out.println( containsDuplicate.containsDuplicate(nums2));
    }
}
// Expected output is:
// true
// false

   