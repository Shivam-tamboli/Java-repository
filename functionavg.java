import java.util.Scanner;
// Created a class name is functionavg.
public class functionavg {
    // created a function name,and taking argunments in a function.
    public static Float Three_number_average (Float a, Float b, Float c){
        // Integer sum of a and b and c = sum
        Float sum = (a + b + c) / 3;
        // The function retrun a sum.
        return sum;

    }
    public static void main(String[] args) {
        // Created a scanner object.
        Scanner sc = new Scanner(System.in);
        // printing the statement for a.
        System.out.println("Enter the value of a:");
        // Taking input form the user for a.
        Float a = sc.nextFloat();
        // printing the statement for b.
        System.out.println("Enter the value of b:");
         // Taking input form the user for b.
        Float b = sc.nextFloat();
         // printing the statement for c.
        System.out.println("Enter the value od c:");
         // Taking input form the user  for c.
        Float c = sc.nextFloat();
        //  average of a,b,c.
        Float average = (a + b + c) / 3;
        // Printing the average.
        System.out.println("The average of the three numbers is: " + average);
    }
    
}
// Expected output is.
// Enter the value of a:
// 45
// Enter the value of b:
// 54
// Enter the value od c:
// 54
// The average of the three numbers is: 51.0