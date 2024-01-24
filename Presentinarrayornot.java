/*Take inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
Example 1:
How many numbers you want to print:
5
int arr[] = {1,2,3,4,5}
search element in an array:
3
3 is present in an array

Example 2:
How many numbers you want to print:
7
int arr[] = {1,2,3,4,5,6,7}
search element in an array:
9
It is not present in an array
*/


import java.util.Scanner;

public class Presentinarrayornot {
    public static void main(String[] args) {
        // Created a scanner class.
        Scanner Scan = new Scanner(System.in);
        System.out.println("How many numbers you want to print:");
         // Integer n means n numbers will store in array.
        int n = Scan.nextInt();
        System.out.println("Enter" + n + "Integers");
        // Created an array,size of n.
        int arr[] = new int[n];
        // for loop.
        for(int i = 0; i<n; i++){
            // Integer i will stores the value in an array.
            arr[i] = Scan.nextInt();
        }
        // for loop for printing the elements of an array.
       for(int i = 0; i<n; i++){
        System.out.println(arr[i]);
       }
    //    Searching for the element.
       System.out.println("Search a element:");
    //    it will store the seacrh element.
       int searchelement = Scan.nextInt();
    //    boolean will ans in true or false.
       boolean found = false;
    //    for loop for checking the element.
       for(int i = 0; i<n; i++){
        // if statement if in array is equal to search element.
        if(arr[i] == searchelement){
            // if found the element in an array,it means true.
            found = true;
            break;
        }
       }
    //    if found then print present in an array
       if(found){
        System.out.println(searchelement+ "present in an array:");
       }
       else
    //    else It is not present in an array
       {
        System.out.println(searchelement + "It is not present in an array:");
       }
        
       
    }
    
}

// Expected output will be :
/*How many numbers you want to print:
9
Enter9Integers
32
45
23
45
87
97
45
45
34
32
45
23
45
87
97
45
45
34
Search a element:
34
34present in an array: 

How many numbers you want to print:
6
Enter6Integers
1 
2
56 
68
64
45
1
2
56
68
64
45
Search a element:
100
100It is not present in an array:
*/