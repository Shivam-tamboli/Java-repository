import java.util.Scanner;

public class Checlingnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Asking for input.
        System.out.print("Input number: ");
        // Taking input in the input.
        int input = in.nextInt();
        // Using if condition.
        if (input > 0)
        {
            System.out.println("Number is positive");
        }
        // Using else if condition.
        else if (input < 0)
        {
            System.out.println("Number is negative");
        }
        // Using else condition.
        else
        {
            System.out.println("Number is zero");
   
    }

}

}

// Expected output.
// Input number: 4
// Number is positive

// Input number: 0
// Number is zero

// Input number: -3
// Number is negative