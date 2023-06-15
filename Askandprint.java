import java.util.Scanner;

public class Askandprint {
    public static void main(String[] args) {
        // Scanner class.
        Scanner sc = new Scanner(System.in);
        // Asking name.
        System.out.println("Please enter your name:");
        // Storing the name in name.
        String name = sc.next();
        // printing name with an statement.
        System.out.println("Have a nice day " + name);


    }
    
}


// Expected output.
// Please enter your name:
// Shivam
// Have a nice day Shivam