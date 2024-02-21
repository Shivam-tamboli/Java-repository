/* */
package February;

import java.util.Scanner;

public class Prefixsum {
    // Helper method to print the array.
    // static helps to call method without  creating object of the class.
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    // static helps to call method without  creating object of the class.
    static int[] makeprefixsum(int[] arr){
        // n the size of an array.
        int n = arr.length;
       
        // using for loop,it will start from 1.
        for(int i = 1; i<n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }
   
    public static void main(String[] args) {
        // Created a scanner.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        // Stored the size of an array.
        int n = Scan.nextInt();
        // Created an array size of n.
        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements");
        // Using for loop.
        // storing the elements  in the array.
        for(int i = 0; i<n; i++){
            arr[i] = Scan.nextInt();
        }
        // Printing an array.
        printArray(arr);
        int[] pref = makeprefixsum(arr); 
        printArray(pref);
       
    }
    
}
/*The expected output will be 
Enter the size of array:
3
Enter3elements
5
5
5
5 5 5 
5 10 15
 */