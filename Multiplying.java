import java.util.Scanner;

public class Multiplying {
    public static void main(String[] args) {
        // Statement.
        System.out.println("Enter the first input please:");
        // Created scanner.
        Scanner sc = new Scanner(System.in);
        // Taking input from the user.
        int a = sc.nextInt();
        // Statement.
        System.out.println("Enter the second input please:");
        // Taking input from the user.
        int b = sc.nextInt();
        // The sum of a and b is in the sum.
        int sum = a * b;
        // Printing the sum
        System.out.println(sum);


    }
    
}

// Expected output is.
// Enter the first input please:
// 6
// Enter the second input please:
// 6
// 36
 