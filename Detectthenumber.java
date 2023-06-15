import java.util.Scanner;

public class Detectthenumber {
    public static void main(String[] args) {
        // printing the statement.
        System.out.println("Please enter the number:");
        // creating a scanner object.
        Scanner sc =  new Scanner (System.in);
        // Finding the user giving number is intiger or not.
        System.out.println(sc.hasNextInt());

    }
    
}
// Expected output.
// Please enter the number:
// 4t4t4t4
// false