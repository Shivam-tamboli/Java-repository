import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        // Creating scanner class.
        Scanner in = new Scanner(System.in);
        // character,taking input,removing extra space,alphabet.
        char ch = in.next().trim().charAt(0);
        // USing if condition.
        if(ch >= 'a' && ch <= 'z')  {
            // Printing.
            System.out.println("Lower case");
        }
        // Else condition.
        else{
            // Printing.
            System.out.println("Upper case");
        }
        // Printing the ch.
        System.out.println(ch);
    }
    
}

// Expected output is.
// a
// Lower case
// a

// A
// Upper case
// A

