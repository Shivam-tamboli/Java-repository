/*Given an integer array nums and a target integer target,
 write a Java method findLastOccurrence to return the index of the last occurrence of target in nums. 
 If target is not found in nums, return -1 

Exapmle : 
Input : 
int arr = {1,2,3,4,5,6,7,1} 
Output : 
*/
package July;
import java.util.*;
public class LastOccurence {
    public static int solution(int[] arr, int target){
        // loop will initialize ending to starting, it will run untill i become greater than or equal to zero,
        // it is decrementing.
        for(int i = arr.length-1; i >=0; i--){
            // In array if found target then,return index of the target.
            if(arr[i] == target){
                return i;
            }
        }
        // Otherwise return -1.
        return -1;

    }
    public static void main(String[] args) {
        // Created an array.
        int[] arr = {1,2,3,4,5,6,7,8,3};
        // Target value.
        int target = 3;
        // Result contains method and parameters.
        int result = solution(arr,target);
        // Print the result.
        System.out.println("The lastoccurance of the target" + target + ":"+"is index " +  result);
    }
    
}
/*Expected input will be :
 *  int[] arr = {1,2,3,4,5,6,7,8,3};
 *  int target = 3;
 * 
 * The expected output will be :
 * The lastoccurance of the target3:is index 8 
 */