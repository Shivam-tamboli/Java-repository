import java.util.Scanner;

public class switch1 {
     System.out.println("Enter a number.");
        Scanner sc = new Scanner(System.in);
        // Taking input from the user.
        int button = sc.nextInt();
//      If we have multiple cases the we wil use switch statement.
        switch(button){
            // Case 1, if user gave input 1.
            case 1: System.out.println("Hello.");
            // break.
            break;

            // case 2, if user gave input 2.
            case 2: System.out.println("Namaste.");
            // break.
            break;

            // case 3, if user gave input 3.
            case 3: System.out.println("Bonjure.");
            // break.
            break;

            // Using default if the user gave different input .
            default: System.out.println("Invalid option."); 
    
}
}
