/*Example 1 : 
 * Input : 
 * int arr = {2,1,3,5,4,6}
 * Output : 
 * {1,2,3,4,5,6}
 * 
 * Example 2 :
 * Input:
 * Int arr = {35,25,30,20,15,10,5}
 * Output :
 * {5,10,15,20,25,30,35}
 * 
 */
package July;
import java.util.*;

public class BubbleSort {
    public static void solution(int[] arr){
        // n = Lenght of array.
        int n = arr.length;
        // OuterLoop will run until it goes to the end and sort the array.
        for(int i = 0; i<n-1; i++){
            // InnerLoop will run until it goes to the end and sort the array.
            for(int j = 0; j<n-1; j++){
                // Condition if in array j is greater then j + 1.
                if(arr[j] > arr[j+1]){
                    // Swap the values.
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }
    public static void main(String[] args) {
        // Creted an array.
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Orignal array:" + Arrays.toString(arr));
        // Called method.
         solution(arr);
        //  Printing sorted array.
        System.out.println("Sorted array:" + Arrays.toString(arr));
    
    }
    
}
/*The Expected input will be :
 * Input : 
 * int[] arr = {64, 34, 25, 12, 22, 11, 90};
 * 
 * The Expected output will be:
 * Orignal array:[64, 34, 25, 12, 22, 11, 90]
    Sorted array:[11, 12, 22, 25, 34, 64, 90]
 * 
 */