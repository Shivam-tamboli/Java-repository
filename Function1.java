import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        // Created a scanner class.
        Scanner in = new Scanner(System.in);
        System.out.println("Entert the number 1:");
        // number 1.
        int num1 = in.nextInt();
        System.out.println("Enter the number 2:");
        // number 2.
        int num2 = in.nextInt();
        // sum 
        int sum = num1 + num2;
        // Printing the sum.
        System.out.println("The sum = " + sum);
    }
    
}
// Expected output is.
// Enter the number for  a:
// 45
// Enter the number for b:
// 54
// The sum of a and b is:99