import java.util.*;
public class ifelse1 {
    public static void main(String[] args) {
        // Printing statement.
        System.out.println("Enter your age please:");
        // Created scanner object.
        Scanner sc = new Scanner(System.in);
        // Taking input form the user as an integer.
        int age = sc.nextInt();
        // Using if condition statement.
        if(age>=18){
            System.out.println("You are eligible for voting:");

        }
        else{
            System.out.println("No you are not eligible for voting:");
        }
    }
    
} 
// Expected output is.
// Enter your age please:
// 11
// No you are not eligible for voting:

// Enter your age please:
// 18
// You are eligible for voting: