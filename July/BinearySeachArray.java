/*Given a sorted integer array nums, return the index of the target element. 
If the target is not found, return -1 
Input: 
nums = [1, 2, 3, 4, 5];
target = 3
Output : 2

Input :
nums = [1,2,3,4,5,6,7];
Target : 4;
Output : 3*/

package July;

public class BinearySeachArray {
    // created a method.
    public static int solution(int[] arr , int target){
        // initialized.
        int left = 0;
        int right = arr.length-1;
        // Ensure that loop will run left index is less than or equal  to the right.
        while (left<= right) {
            // Calcualting mid point.
            int mid = left + (right - left ) / 2;
            // if mid point is the target value it will return mid.
            if(arr[mid] == target){
                return mid;
                // Search should continue in right half.
            }else if(arr[mid]<target){
                left = mid+1;
                // Search should continue in left half.
            }else{
                right =  mid - 1;
            }
            
        }
        // If doesn't found target element then return -1.
        return -1;
    }
    public static void main(String[] args) {
        // Created an array.
        int[] arr = {2,3,4,5,6,7,8,};
        // The target value.
        int target = 5;
        // In index we called our method.
        int index = solution(arr, target);
        // Calld index.
        System.out.println("Index of target " + target + ": " + index);
    }
    
}
/*The expected input will be:
 *  int[] arr = {2,3,4,5,6,7,8,};
    int target = 5;
    *  The expected output will be:
    Index of target 5: 3
 */