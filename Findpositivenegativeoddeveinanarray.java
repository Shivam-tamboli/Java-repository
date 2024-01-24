/* 
 * Take n integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.

Example 1:
Input : arr[] =  {-5,7,-3,8,9,6,-4,0,1}
output:
number of positive numbers = 5
number of negative numbers = 3
number of odd numbers = 2
number of even numbers = 2
number of 0s. = 1

*/

import java.util.Scanner;
public class Findpositivenegativeoddeveinanarray {
    public static void main(String[] args) {
        // Created a scanner class.
    Scanner Scan = new Scanner(System.in);
// Declaring the variables.
        int positivecount = 0;
        int negativecount = 0;
        int oddcount = 0;
        int evencount = 0;
        int zerocount = 0;

    System.out.println("How many numbers you want to print:");
    // The input will store in integer n.
    int n = Scan.nextInt();
    // They will print n numbers integers
    System.out.println("Enter" + n + "Integers");
// Created an array the size of n number.
    int arr[] = new int[n];
    // Using for loop.
    for(int i = 0;i<n;i++){
        // taking input in integer i.
        arr[i] = Scan.nextInt();
    }
    // Using for loop.
    for(int i = 0;i<n;i++){
        // Printing elements of an array.
        System.out.println(arr[i]);
    }
    // Using for loop.
    for(int i = 0; i<n;i++){
        // if array is greater then 0, it means the number is positive.
        if(arr[i]>0){
            positivecount++;
        }
        // else if if it is smaller then 0 , it means the number is negative.
        else if(arr[i] < 0){
            negativecount++;
        } 
        // if the integer i is divide by 2 and the reminder is 0 it means the number is even.
        if(arr[i]   %2 == 0){
            evencount++;
        }
         // if the integer i is divide by 2 and the reminder is not 0 it means the number is odd.
        else{
            oddcount++;
        }
        // if the integer is equal to 0 it means it is 0.
        if(arr[i] == 0){
            zerocount++;
        }
    }
    //  Printing.
    System.out.println(   "Number of positive numbers: "  +  positivecount++ );
    System.out.println(   "Number of negative numbers: "  +  negativecount++ );
    System.out.println(   "Number of even numbers: "  +  evencount++ );
    System.out.println(   "Number of odd numbers: "  +  oddcount++ );
    System.out.println(   "Number of zero numbers: "  +  zerocount++ );
    
    

    
    }
    
}
// The expected input: 
/*
1
2
4
0
-2
0
-6
-8
5
4


The expected output will be:
1
2
4
0
-2
0
-6
-8
5
4
Number of positive numbers: 5
Number of negative numbers: 3
Number of even numbers: 8
Number of odd numbers: 2
Number of zero numbers: 2
 */