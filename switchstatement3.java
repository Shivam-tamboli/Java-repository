import java.util.Scanner;

public class switchstatement3 {
    public static void main(String[] args) {
        // Find the weekdays and weekends
        Scanner in = new Scanner(System.in);
        // 
        int day = in.nextInt();
        // 
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekday");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
        }

    }
    
}
// Expected output is.
// 4
// Weekday

// 7
// Weekend

// 1
// Weekday
