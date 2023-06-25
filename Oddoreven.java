import java.util.Scanner;

public class Oddoreven {
    public static void main(String[] args) {
        // Printing the statement.
        System.out.println("Please enter the number:");
        // We have made scanner's object.
        Scanner sc = new Scanner(System.in);
        // Now we have taken the input from the user.
        int num = sc.nextInt();
        // Using if condition .
        if (num % 2 == 0){
            System.out.println("The number is even.");
        }
        // Using else condition .
        else{
            System.out.println("The number is odd.");
    }
    
}

}

// Expected output.
// Please enter the number:
// 3
// The number is odd

// Please enter the number:
// 66
// The number is even.