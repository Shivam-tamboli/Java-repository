import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        // Printing statement.
        System.out.println("Taking input from the user:");
        // Made a scanner class.
        Scanner sc = new Scanner(System.in);
        // Printing statement for number 1.
        System.out.println("Enter the number1:");
        // Instance of scanner class for intiger.
        // Taking input from  the user for number1.
        int a = sc.nextInt();
        // Printing statement for number 2
        System.out.println("Enter the number2:");
        // Taking input from the user for number 2.
        int b = sc.nextInt();
        // Sum contains the sum of a and b.
        int sum = a + b ;
        // Printing statement for sum.
        System.out.println("The sum of a and b is:");
        // Printing the sum.
        System.out.println(sum);

}
}

// Expected output is.
// Enter the number1:
// 2
// Enter the number2:
// 4
// The sum of a and b is:
// 6