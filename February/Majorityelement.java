/*Given an integer  array of size n find all elements  that appear more than n/3  times.
* 
Example 1: 
Input : arr = [1,2,3,2,3,2,1,2]
Output : 2

Example 2:
Input : arr = [7,1,3,1,7,2,7,6,7]
Output : 7
*/
package February;

import java.util.HashMap;

public class Majorityelement {
    public static void majorityelement(int[] num) {
        // Created a hashmap.
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = num.length;
        // Iterate the elements of nums.
        for(int i = 0; i<n; i++){
            /*True: if it is contains */
            if(map.containsKey(num[i])){ 
                /*The key will be same, but the value will increment by one. */
                map.put(num[i] , map.get(num[i]) + 1);
                /*False */
        }else{
            /*If the key doesn't exist then it will make new one and the frequency  will be 1.*/
            map.put(num[i] , 1);
        }

    }
    /* map.keySet() : {1,3,2,5} */
    /*(int key  : it will take elements form set. */
    for(int key : map.keySet()){
        /*map.get(key) : if i use this it will provide me the value of key. */
        if(map.get(key) > n/3){
            System.out.println(key);
        }
    }
}
    public static void main(String[] args) {
        // Created an array and stored elements.
        int[] nums = {1,3,2,5,1,3,1,5,1};
        // Called a function.
        majorityelement(nums);
    }
    

}
/*The expected input will be :
 * Input : int[] nums = {1,3,2,5,1,3,1,5,1};
 * 
 * The expected output will be :
 *  1
 */