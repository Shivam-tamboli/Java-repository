import java.util.Scanner;
// Created a class.
public class Addfunction1 {
    // Created a function, it taking argunments.
    public static int Addition (int a , int b){
        // Integer sum of a and b.
        int sum = a + b;
        // it will return the sum of a and b.
        return a+b;

    }

    public static void main(String[] args) {
    // Writing statement for integer a.
        System.out.println("Enter the value for a:");
        // Created a scanner object.
        Scanner sc = new Scanner(System.in);
        // Taking input form the user for integer a.
        int a = sc.nextInt();
        // Writing statement for integer b.
        System.out.println("Enter the value for b:");
        // Taking input form the user for integer b.
        int b = sc.nextInt();
        // Integer sum of a and b.
        int sum = a + b;
        // Printing the sum of a and b with statement.
        System.out.println("The sum of a and b is :" + sum);

    }
    
}

// Expected output is.
// Enter the value for a:
// 5
// Enter the value for b:
// 5
// The sum of a and b is 10