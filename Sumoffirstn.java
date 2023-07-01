import java.util.*;
public class Sumoffirstn {
    public static void main(String[] args) {
        // Scanner.
        Scanner sc = new Scanner(System.in);
        // Instance of scanner.
        int n = sc.nextInt();
        
        // initializing of sum.
        int sum = 0;
        // Initializing    , Condition   , Updation
        for(int counter = 0; counter <= n; counter++){
            // Updation.
            sum = sum + counter;
            // Printing the sum.
            System.out.println(sum);
        }
    }
    
}
// Expected output.
// 4
// 0
// 1
// 3
// 6
// 10