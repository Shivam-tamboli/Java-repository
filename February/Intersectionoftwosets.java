/* Develop a Java program to find and print the intersection of two sets using HashSet. 
Take two arrays as input and output the common elements between the sets.*/
/*Example 1:
 Input:  [1,2,3,4,5,6] [7,1,3,5,8,9]
 Output: [1,3,5]

Example 2:
Input:  [10,20,30,40,50] [20,90,10]
Output: [10,20]
 */
package February;

import java.util.HashSet;

public class Intersectionoftwosets{
    public static void main(String[] args) {
        // Created an array.
        int[] arr1 = {1,2,3,4,5};
        //  Created an array.
        int[] arr2 = {6,3,7,4};
        // Crested a hashset.
        HashSet<Integer> set1 = new HashSet<>();
        for(int element : arr1){ 
            set1.add(element);
            // Elements were added to set1.
        }
         // Crested a hashset.
        HashSet<Integer> set2 = new HashSet<>();
        for(int elements : arr2){
            set2.add(elements);
             // Elements were added to set1.
        }
        // Crested a hashset.
        HashSet<Integer> intersection = new HashSet<>(set1);/*set1 : making a copy into an intersection. */
        intersection.retainAll(set2);/*retainAll : contains commen elements between two sets. */
        // Set1 output.
        System.out.println("Set1 elements are:" + set1); 
        // Set2 output.
        System.out.println("Set2 elements are:" + set2); 
        //  Printing the common elements of two sets.
        System.out.println("Intersection of two sets:" + intersection);

    }
}
/*The expected input will be:
    Input:
 * set1 : [1,2,3,4] [3,4,5,6]
 * Output : [3,4]
 * 
 * 
 * 
 */