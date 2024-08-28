/**
 * LeetCode
 * KthDistinctStringinanArray
 * 
A distinct string is a string that is present only once in an array.
Given an array of strings arr, and an integer k, return the kth distinct string present in arr. 
If there are fewer than k distinct strings, return an empty string "".
Note that the strings are considered in the order in which they appear in the array.

Example 1:
Input
 arr : "a","v","a","t","c";
 k = 4
Output : "";


Example : 2
Input :
arr : "w","t","a","e";
k = 2

Output :
t
 */
package August;
import java.util.*;
import java.util.LinkedHashMap;

public class KthDistinctStringinanArray {

    public static String solution(String[] arr, Integer k){
        // created map it will store order wise.
        LinkedHashMap<String,Integer> strcount = new LinkedHashMap<>();
        // loop in strings. ex(aaa)
        for(String s : arr){
            // add in amp.
            strcount.put(s, strcount.getOrDefault(s, 0) + 1);
        }
        // created var it will count the distinct string.
        int distinctcount = 0;
        // this function will give the set of the key and his value.
        for(Map.Entry<String, Integer> entry : strcount.entrySet()){
            // if entrys values is 1.
            if(entry.getValue() == 1){
                // incriment the couunt.
                distinctcount++;

                // and count is equal to k.
                if(distinctcount == k){
                    // return his key.
                    return entry.getKey();
                }
            }
        }
        // if not retrun empty string.
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"aaa","aa","a"};
        Integer k = 1;
        String result = solution(arr, k);
        System.out.println(result);
    }
}
/*
 * The expected input will be:
String[] arr = {"aaa","aa","a"};
Integer k = 1;

The expected output will be:
aaa
 */
