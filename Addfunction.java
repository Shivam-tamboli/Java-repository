import java.util.Scanner;
// Created a class.
public class Addfunction {   
    // Created a class name by calculatesum and integer arguments.
    public static int calculatesum(int a,int b){
        // int sum.
        int sum = a + b;
        // It will return sum.
        return sum;
    }

    public static void main(String[] args) {
        // Created a scanner object.
        Scanner sc = new Scanner(System.in);
        // Printing the statement for int a.
        System.out.println("Enter the number for  a:");
        // Taking input from the integer a 
        int a  = sc.nextInt();
        // Printing the statement for integer b.
        System.out.println("Enter the number for b:");
        // Taking input from the user for integer b.
        int b = sc.nextInt();
        // integer sum is equal to calculatesum giving arguments.
        int sum = calculatesum(a, b);
        // Printing the sum.
        System.out.println("The sum of a and b is:"+sum);

    }
 
}

// Expected output is.
// Enter the number for  a:
// 1000
// Enter the number for b:
// 1000
// The sum of a and b is:2000