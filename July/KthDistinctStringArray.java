/*LeetCode
 * 2053. Kth Distinct String in an Array
 * 
 * A distinct string is a string that is present only once in an array.

Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
If there are fewer than k distinct strings, return an empty string "

Example 1: input 
    arr = ["q","e,"a","q","e",]
    k = 1

    output:
    "a"

    Example 2: input :
    arr = ["w","a",y,"a","y","r"]
    k = 2

    output : 
    "r"

    Example 3: input 
    arr = ["kkk","kk","k"]
    k = 1

    output :
    "kkk"

    Example : input 
    arr = ["e","g","e"]
    k = 2

     output :
     "";
 */

package July;


import java.util.LinkedHashMap;
import java.util.*;

public class KthDistinctStringArray {
    public static String solution(String[] arr, int k){
        // Created a linkedhashmap, it will contain the strings orderwise.
        LinkedHashMap <String , Integer> map = new LinkedHashMap<>();
        // using for loop it will iterate through all elements.
        for(int i = 0; i<arr.length; i++){
            // we will check if map contains the string it wili increment form 1.
            // i is at index 0 it will go throgh till end.
            if(map.containsKey(arr[i])){
                // if map contains that string, first it will get the value of key the it will incriment from 1.
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            // if does not exist then it will add into the hashmap.
            else{
                map.put(arr[i], 1);
            }
        }
        // list will hold only distint string, means those string appears only once in hashmap.
        ArrayList<String > list = new ArrayList<>();
        // this loop will iterate through all key and value 
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            // if entery value frequency is equal to 1.
            if(entry.getValue() == 1){
                // it will add to the list.
                list.add(entry.getKey());
            }

        }
        // if list size is smaller then k.
        if(list.size() < k){
            // it will return empty string.
            return "";
        }

        // result 
        String result = list.get(k - 1);
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"a","b","c","a","b","d"};
        int k = 3;

        String ans = solution(arr, k);
        System.out.println(ans);
        
    }
    }
    

    