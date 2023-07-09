import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Printing statement.
        System.out.println("Enter the value for a:");
        // Created a scanner object.
        Scanner sc  = new Scanner (System.in);
        // Taking input from the user.
        Float a = sc.nextFloat();
        // Printing the statement.
        System.out.println("Enter the value of b:");
        // Taking input from the user.
        float b = sc.nextFloat();
        // Printing statement.
        System.out.println("Enter the value of c:");
        // Taking input from the user.
        Float c  = sc.nextFloat();
        // The average of a,b,c.
        Float average = (a + b + c) / 3;
        // The average of a,b,c is.
        System.out.println("The average of a,b,c:" + average);
    }
    
}
// Expexted output is.
// Enter the value for a:
// 12
// Enter the value of b:
// 12
// Enter the value of c:
// 34
// The average of a,b,c:19.333334