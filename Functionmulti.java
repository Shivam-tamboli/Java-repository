import java.util.Scanner;

// Created  a class function .
public class Functionmulti {
    // Created a function name is multiplication.
    public static int multiplication (int a, int b){
        // It will return the sum of a and b.
        int sum  =  a * b ;
        // return sum.
        return  sum;
    }
    public static void main(String[] args) {
        // Created a Scanner class object.
        Scanner sc = new Scanner (System.in);
        // Printing statement for a.
        System.out.println("Enter the value for a:");
        // Taking input from the user as a int.
        int a = sc.nextInt();
        // Printing statement for b.
        System.out.println("Enter the value for b:");
        // Taking input from the user as a int for b.
        int b = sc.nextInt();
        // The sum.
        int sum = multiplication(a, b);
        // Printing the statement for sum, and printing the sum.
        System.out.println("The sum of these two numbers is :" + sum);


    }
}
// Expected output is.
// Enter the value for a:
// 5
// Enter the value for b:
// 5
// The sum of these two numbers is :25