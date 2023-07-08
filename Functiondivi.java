import java.util.Scanner;
// Created a class function.
public class Functiondivi {
    // Created a function name by division, and taking argumenst in a function.
    public static float division (float a, float b){
        // The sum of a and b.
        float sum = a / b ;
        // It will return the sum of a and b as a float.
        return sum;
    }
    
    public static void main(String[] args) {
        // Created a scanner object.
        Scanner sc = new Scanner (System.in);
        // Printing the statement for a.
        System.out.println("Enter the value of a :");
        // Taking input from the user.`
        float a = sc.nextFloat();
        // Printing the statement for b.
        System.out.println("Enter the value of b:");
        // Taking input from the user.
        float b = sc.nextFloat();
        // Created sum for function.
        Float sum =  division(a, b);
        // printing the sum.
        System.out.println("The division of a and b is :"+sum);

    }
}

// Expected output is.
// Enter the value of a :
// 2
// Enter the value of b:
// 6
// The division of a and b is :0.33333334