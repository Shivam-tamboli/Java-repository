import java.util.Scanner;

public class Switchstatement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Taking input from the user.
        int day = in.nextInt();
        // Switch statement.
        switch (day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        
        }
    }
    
}
// Expected output is.
// 6
// Saturday

// 1
// Monday

// 5
// Friday