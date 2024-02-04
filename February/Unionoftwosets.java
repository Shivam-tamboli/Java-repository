/*Write a Java program to find and print the union of two sets using HashSet. 
The program should take two arrays as input and output the elements present in either of the sets.

Example 1:
Input : [2,1,3,5] [4,8,6,7]
Output : [1,2,3,4,5,6,7,8]

Example 2:
Input : [10,30,50,70] [20.40,60,80]
Output : [10,20,30,40,50,60,70,80]
*/
package February;
import java.util.HashSet;
public class Unionoftwosets {
    public static void main(String[] args) {
        // Created an array  of  integers.
        int[] arr1 = {10,30,50,70,90,100};
        // Created an array  of  integers.
        int[] arr2 = {20,40,60,80,10};
        // created hashset to stored unique elements.
        HashSet<Integer> set1 = new HashSet<>();
        // Elemets of array 1.   
        for(int element : arr1){
            set1.add(element);
            // Elements were added to set1.
        }
        // created hashset to stored unique elements.
        HashSet<Integer> set2 = new HashSet<>();
        for(int element :arr2){
            set2.add(element);
            // Elements were added to set2.
        }
        // Created a hashset name of Unionset,it will store the unique elements of two sets.
        // set 1 added into hashset.
        HashSet<Integer> unionset = new HashSet<>(set1);
        // set 2 added into hashset.
        unionset.addAll(set2);
        // The output of 2 sets.
        System.out.println("Unoin of two sets is" + unionset);
        
    }

}
/*
Example 1:
The expected Input will be:
 arr1 = {1,3,5,7,9,0};
  arr2 = {2,4,6,8,1};

The expected output will be:
Unoin of two sets is[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

Example 2:
The expected Input will be:
 arr1 = {10,30,50,70,90,100};
 arr2 = {20,40,60,80,10};

The expected output will be:
Unoin of two sets is[80, 50, 100, 20, 70, 40, 10, 90, 60, 30]
 * 
 */