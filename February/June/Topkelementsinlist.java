// NeetCode
// 
// 
// Eample 1 : 
// Input:
// nums = {1,2,2,2,3,3,4,4,4,4}
// k = 2
// Output: {4,2}
// Example 2:
// Input : nums = {1,1,1,2,3,3}
// k = 1
// Output : {1}
// Example 3:
// Input : 
// nums = {1,1,3,3}
//  k = 1
// Output : {1}

package February.June;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.*;

public class  Topkelementsinlist{

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3}; // Example input
        int k = 2; // We want the top 2 frequent elements

        int[] topKFrequentElements = topKFrequent(nums, k);

        // Print the result
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topKFrequentElements));
    }

    // Static method to find the top k frequent 
    public static int[] topKFrequent(int[] nums, int k) {
        // It will store each elements in nums as key and his frequency.
        Map<Integer, Integer> count = new HashMap<>();
        // 
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}