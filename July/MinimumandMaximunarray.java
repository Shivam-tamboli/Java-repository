//  Given an integer array, find the maximum and minimum elements in the array.
// Example : 
//  input :
// arr = {1,2,3,5,6,7,8}
// Output : 
// Maximum : 8
// Minimum : 1
package July;
public class MinimumandMaximunarray {
    public static int[] solution(int[] arrays) {
        // checking arrays are null or not.
        if (arrays == null || arrays.length == 0) {
            // if it is return.
            throw new IllegalArgumentException("Array is null or empty");
        }
        // maximum.
        int max = arrays[0];
        // minimum.
        int min = arrays[0];
        // Iterating over all elements.
        for (int arr : arrays) {
            // if array is greater then maximun, it is maximum value.
            if (arr > max) {
                max = arr;
            }
            // if array is lesser then minimum, it is minimum value.
            if (arr < min) {
                min = arr;
            }
        }
        // return new integer array with new maximum and minimum value.
        // with indices of 0 and 1.
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        // Creted a array.
        int[] arrays = {4, 2, 5, 1, 8, 6, 9, 7};
        // Inside  values called method.
        int[] values = solution(arrays);
        System.out.println("Minimum: " + values[0] + ", Maximum: " + values[1]);
    }
}
/*The expected input will be:
 * Input :
 *  int[] arrays = {4, 2, 5, 1, 8, 6, 9, 7};
 * 
 * The expected output will be:
 * Minimum: 1, Maximum: 9
 */
