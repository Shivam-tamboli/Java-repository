/*Reverse the elements of a given array in place.
 * Example : 
 * Input : 
 * arr = {2,3,4,5,6}
 * Output :
 *  {6,5,4,3,2};
 * 
 * Example : 
 *Input : 
 arr = {10,20,30,40,50}
 Output :
 {50,40,30,20,10}
 */
package July;

import java.util.*;

public class ReveseArray {
    public static void solution(int[] arr){
        int left = 0;
        int right = arr.length-1;
        // loop will run till the right part lesser then left 
        while(left<right){
            // temp :  is temporay element to hold the value of left.
            int temp = arr[left];
            // We can right value assign to left.
            arr[left] = arr[right];
            // arr[right] : now holds the value temp,means value of left.
            arr[right] = temp;

            // Pointers will move.
            left++;
            right--;

        }


    }
    public static void main(String[] args) {
        // Created an array.
        int[] arr = {1,2,3,4,5};
        System.out.println("Orignal array:" + Arrays.toString(arr));
        solution(arr);
        System.out.println("Reversed array:" + Arrays.toString(arr));
        
    }
}
/*Expected input will be :
 * Input : 
 * int[] arr = {1,2,3,4,5};
 * Expected input will be :
 * Output :
 * Orignal array:[1, 2, 3, 4, 5]
   Reversed array:[5, 4, 3, 2, 1]
 */