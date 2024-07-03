/*Write a program to find the index of a target element in an array using linear search.
 * Input : int[] arr = {1,3,2,5,6}
 * Int target = 6;
 * 
 * Output : 4.
 * 
 * Input : int[] arr = {12,45,67,78,}
 * Int target = 12;
 * 
 * Output : 0;
 */

package July;

public class LinearSearchArray {
    // created a method,passed parameters.
    public static int solution(int[] arr , int traget){
        // Iterating over all elements.
        for(int i = 0; i<arr.length; i++){
            // if the target element found in array. 
            if(arr[i] == traget){
        // It will return the index of target value.
                return i;
            }
            
        }
        // If does not find target value in array it will return -1.
        return -1;

    }
    public static void main(String[] args) {
        // Created an array.
        int[] arr = {1,2,3,4,5};
        // The target value.
        int traget = 3;
        // Calling the method.
        System.out.println(solution(arr, traget));
    }
    
}
/*The expected input will be :
 * Input : 
 * int[] arr = {1,2,3,4,5};
 * int traget = 3;
 * 
 * The expected output will be : 
 * 2
 * 
 */