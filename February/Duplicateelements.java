/* Question : Write a Java program to find and print duplicate elements in an array using a HashSet. 
The program should take an array of integers as input and output the elements that appear more than once.
Example 1:
Input : arr = {1,2,3,4,5,6,7,3,5,7}
Output : The duplicate elements are [3,5,7]

Example 2:
Input : arr = {21,54,10,65,21,76,78,65,80,10}
Output : The duplicate elements are [21,65,10]
*/
package February;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicateelements {
    public static void main(String[] args) {
    // Created an integer to store the elements in an array.
    int[] arr = {100,99,65,78,200,65,100,99};
    // Created a hashset to stored a unique numbers.
    HashSet<Integer> uniqueelements = new HashSet<>();
    // Using for loop iteration to add all elements in an array.
    // elements : elements of an array.
    for(int element : arr){
        // Using if statement and logical Not operator negates the result.
        if(!uniqueelements.add(element)){
            // retrun true that means the  element is added and is unique, ! makes it false.
            // return false that means the element is not added because it's already present), ! makes it true.
            System.out.println("Duplicate element:" + element);
        }
    }

}
    
}
/*The expected intput will be:
 * int[] arr = {4, 2, 8, 3, 2, 7, 1, 4, 8, 5};
 * 
 * The expected output will be:
 *  Duplicate element:2
    Duplicate element:4
    Duplicate element:8

    The expected intput will be:
    int[] arr = {100,99,65,78,200,65,100,99};
    The expected output will be:
    Duplicate element:65
    Duplicate element:100
    Duplicate element:99


 */