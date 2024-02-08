/*Write a Java program to create an ArrayList of integers and add the numbers 1 to 5 to the list. 
Then, print out all the elements of the ArrayList. 

Example 1:
Input:  1,2,3,4,5

Output :
arraylist = [1,2,3,4,5]*/

package February;

import java.util.ArrayList;

public class Arraylistadd {
    public static void main(String[] args) {
        // Created an array list.
        ArrayList<Integer> List = new ArrayList<>();
        // Added numbers into an array list.
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        // Printing the output.
        System.out.println(List);


    }
    
}
// The expected input will be:
// List.add(1);
// List.add(2);
// List.add(3);
// List.add(4);
// List.add(5);

// The expected output will be:
// [1, 2, 3, 4, 5]
