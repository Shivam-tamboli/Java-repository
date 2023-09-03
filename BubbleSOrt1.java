import java.util.*;
public class BubbleSOrt1 {
    // Created a function.
   public static void printArray(int arr[]) {
    // USing loop for prinint this array.
       for(int i=0; i<arr.length; i++) {
        // Printing the elements.
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
    // Created an integer array.
       int arr[] = {2,5,8,4,3,6,9};


    //    Outter loop.
       for(int i=0; i<arr.length-1; i++) {
        // Inner loop.
           for(int j=0; j<arr.length-i-1; j++) {
            // Checking the conditions.
               if(arr[j] > arr[j+1]) {
                   //swaping.
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       printArray(arr);
   }
}
// Expected output is.
// 2 3 4 5 6 8 9 