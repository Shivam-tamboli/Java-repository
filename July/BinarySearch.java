/*Given a sorted integer array nums, return the index of the target element. 
If the target is not found, return -1 
Input: 
nums = [1, 2, 3, 4, 5];
target = 3
// Output : 2

Input :
nums = [1,2,3,4,5,6,7];
Target : 4;
Output : 3*/
package July;

import java.util.*;

public class BinarySearch {
// Created a method given parameters.
    public static int Solution(int[] arr , int target){
        // Initialization takes constant O(1) for both start and end.
        // It will start from 0, O(1)
        int start = 0;
        // Ends means total length of array - 1, O(1)
        int end = arr.length - 1; 
        
        // While loop will run till according the condition.
        // Number of iterations: O(log n)
        while(start <= end) {
        //  Formula of mid. O(1)
            int mid = start + (end - start) / 2;
            // if target is lesser then middle value,so our mid point will become end point.O(1)
            if (target < arr[mid]) {
                end = mid - 1;
            // if our target is greater then middle value,so out mid point will become starting point.O(1)
            } else if (target > arr[mid]) {
                start = mid + 1;
            // or else return middle value.O(1)
            } else {
                
                return mid;
            }
        }
        // if the target value doesnt exist it will return -1.O(1)
        return -1;
    }

    


    
    public static void main(String[] args) {
        // Created an array.
        // It is sorted in ascending order.O(1)
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        // Int target value.O(1)
        int target = 11;
        // We called method and parameters into int result.O(log n)
        int result = Solution(arr, target);
        // Called Result.O(1)
        System.out.println(result);
    }
}

/*
 * The expected input will be : 
 *  int[] arr = {1,2,3,4,5,6,7,8,9,10};
 * 
 * The expected output will be:
 * -1
 * 
 *  overall Time complexity :
 * O(log n)
 */