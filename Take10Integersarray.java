// Take 10 integer inputs from user and store them in an array and print them on screen.
/*
 * Example 1:
 * Input:
 * int arr[] = {1,2,3,4,5,6,7,8,9,10}
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 * 
 */
import java.util.Scanner;

public class Take10Integersarray {
    public static void main(String[] args) {
    // Created a scanner class.
    Scanner Scan = new Scanner(System.in);
    // Asking user how many numbers he will enter.
    System.out.println("How many numbers you will enter?");
    // we store the integers into the "n".
    int n = Scan.nextInt();
    // User going to input n number integers.
    System.out.println("Enter" + n + "Integers");
    
    // Now we will create an array:
    // Number of size "n".
    int arr[] = new int[n];
    // We will use of for loop.
    for (int i = 0;i<n;i++){
        arr[i] = Scan.nextInt();
        // We created i for storing the values in an array.
    }
    // Now we are using for loop.
    // for printing all elements of an array.
    for(int i = 0; i<n;i++){
        System.out.println(arr[i]);
    }
}
    
}

// Expected output is:

// How many numbers you will enter?
// 10
// Enter10Integers
// 21
// 23
// 54
// 576
// 67
// 78
// 89
// 56
// 35
// 23
// 21
// 23
// 54
// 576
// 67
// 78
// 89
// 56
// 35
// 23

