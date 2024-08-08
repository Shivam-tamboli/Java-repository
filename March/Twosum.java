/*Neet code Question : Two Sum
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
Example 1 :
Input :nums{1,20,31,45,56,6,76,84,93}, tatget = 7
Output : [05,]

Example 2:
Input : num{24,54,65,87,12,56} , target = 36
Output : [0,4]

 * 
 */


package March;
import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.util.HashMap;


// Main class.
public class Twosum{
 public static int[] twosum(int[] num, int target){
        // Created a hashamp.
        HashMap<Integer , Integer> map = new HashMap<>();
        // Using for loop,iterating over the elements.
        for(int i = 0; i<num.length;i++){
            // Finding compliment.
            //  target - num[i] = 19 - num[Current number in an array].
            int compliment =  target -  num[i];
            // Using if statement,for checking if compliment is already exist or not.
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment) , i};
            }
            // if the element does not exist then store it in map.
            map.put(num[i] , i);

        }
        // That indicates the method has been passed an illegal and an  inappropriate argument.
        throw new IllegalArgumentException("No two sum solution:");
    }

     public static void main(String[] args) {
        // Created an array.
    int[] num = {16,4,23,8,15,42,1,2};
    // The target we have to find.
    int target = 19;
    // Int result will store,the call of method and it parameters.
    int[] result = twosum(num, target);
    // Then we will call result.
    // arrays.toString =  is used to convert the array into a readable string,which can be easily print.
    System.out.println(Arrays.toString(result));
        
    }
    
}
/*The expected input will be :
 * Input :  int[] num = {16,4,23,8,15,42,1,2};
 *  int target = 19;
 * 
 * The expected output will be:
 * [1, 4]
 */
    