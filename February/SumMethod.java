package February;

import java.util.Scanner;

public class SumMethod {
    public static void main(String[] args) {
        // Called method.
     Sum();
    }

    // Created a method.
    static void Sum(){
        // Created a scanner class.
        Scanner in = new Scanner(System.in);
        // Taking input form the user.
        System.out.println("Enter the 1 number");
        int num1 = in.nextInt();
        // Taking input from the user.
        System.out.println("Enter the 2 num");
        int num2 = in.nextInt();
        // sum contains the sum of two numbers.
        int sum = num1 + num2 ;
        System.out.println("The sum of two numbers:");
        // Printing the sum.
        System.out.println(sum);

    }
    
}
