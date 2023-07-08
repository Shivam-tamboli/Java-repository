import java.util.Scanner;
// Created a class function.
public class Factorial {
    // Created a function name is printfactorial, and taking agruments in a function.
    public static void printfactorial (int n){
        // Using if conditional statement.
        // if n is smaller is 0, it will print the statement.
        // And it will not work, it will stop here.
        if (n<= 0){
            System.out.println("This is a invalid number, please check your number:");
            return ;
            // if it is a not 0 so it will run.
        }

        // integer variable.
        int factorial = 1;
        // Using for loop.
        // initializing, condition , updation.
        for(int i = n; i >=1; i--){
            // It will multiple till i.
            factorial = factorial * i;

        }
        // Printing the factorial.
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        // Created a scanner object.
        Scanner sc = new Scanner (System.in);
        // Taking input from the user as a integer value in n.
        int n = sc.nextInt();
        // Giving argunments in a function
        printfactorial(n);
 }
}
// Expected output is.
// 6
// 720