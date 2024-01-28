/*Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
 * Example 1:
 * input  = {1,2,3,4,5,6,7,8,9,0}
 * Output = 0,9,8,7,6,5,4,3,2,1.
 * 
 * Example 2:
 * input  = {10,20,30,40,50,60,70,80,90,100}
 * Output = 100,90,80,70,60,50,40,30,20,10.
 */
import java.util.Scanner;

public class Storeoneelementinanotherelementinreverse {
    public static void main(String[] args) {
        // Created a sacnner class object to take input form the user.
    Scanner Scan = new Scanner(System.in);
    // Created an array a size of 10.
    int a[] = new int[10];
    // Created an array b size of 10.
    int b[] = new int[10];
    // Using for loop.
    // It will iterate each elements of an array.
    for(int i = 0;i<a.length;i++){
        System.out.println("Enter the elements["+i+"]");
        // Int i will store the elements.
        a[i] = Scan.nextInt();
    }
    // Using for loop.
    // it will store elements from array a to b in reverse order.
    int j = 0;
    for(int i = b.length-1;i>=0;i--){
        b[i] = a[j];
        j++;
    }
    // Using loop it will iterate each elements of an array.
    // it will prints all the elements in an array.
    for(int i = 0;i<b.length;i++){
        System.out.println("The value of b ["+i+"] is" + b[i]);
    }

  }
}

// The expected input will be:
/*Enter the elements[0]
21
Enter the elements[1]
34
Enter the elements[2]
45
Enter the elements[3]
76
Enter the elements[4]
16
Enter the elements[5]
96
Enter the elements[6]
76
Enter the elements[7]
54
Enter the elements[8]
90
Enter the elements[9]
38

The expected output will be:

The value of b [0] is38
The value of b [1] is90
The value of b [2] is54
The value of b [3] is76
The value of b [4] is96
The value of b [5] is16
The value of b [6] is76
The value of b [7] is45
The value of b [8] is34
The value of b [9] is21
 * 
 */