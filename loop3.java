import java.util.Scanner;
// Question is print the numbers from 1 to n.
public class loop3 {
    public static void main(String[] args) {
        // Created a scanner.
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        //  Using for loop.
        // initialization , condition , increment.
        for(int num = 1; num <=n; num++){
            // Printing the nmumber.
            System.out.println(num + " ");
        }
    }
    
}
// Expected out is.
// 8
// 1 
// 2 
// 3
// 4
// 5
// 6
// 7
// 8
