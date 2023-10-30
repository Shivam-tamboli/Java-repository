import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //
        String fruit = in.nextLine();
        // Using switch statement.
        // For multiple cases we are using switch statement. 
        switch (fruit) {
            // case 1.
            case "Mango":
            System.out.println("King of fruit");
            break;
            // case 2.
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            // case 3.
            case "Orange":
            System.out.println("The orange is a good source of vitamin C");
            break;
            // For default option.
            default:
            System.out.println("Please enter a valid fruit");
        }
        
    }
    
}
// Expected output is.
// Mango
// King of fruit

// Apple
// A sweet red fruit

// Orange
// The orange is a good source of vitamin C

// Grapes
// Please enter a valid fruit