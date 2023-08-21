
import java.util.*;
public class Bubblesorting {
    // Cretaed a function.
    public static void printArray(int arr[]) {
        // Using for loop for printing the array.
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
 
 
    public static void main(String args[]) {
        // Created an array.
        int arr[] = {7, 8, 1, 3, 2};
 
 
        //bubble sort
        // Outer loop.
        for(int i=0; i<arr.length-1; i++) {
            // Inner loop.
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
 
//  Calling the function.
        printArray(arr);
    }
 

}

// Expected output is.
// 1 2 3 7 8
