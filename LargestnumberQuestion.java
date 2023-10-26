import java.util.Scanner;

public class LargestnumberQuestion {
    public static void main(String[] args) {
        // Created a scanner class.
        Scanner in = new Scanner(System.in);
        // Taking input from the user.
        // Taking input in int a.
        int a = in.nextInt();
        // Taking input in int b.
        int b = in.nextInt();
        // Taking input in int c.
        int c = in.nextInt();

        // Question find the largest number between 3 numbers.

        // integer max is equal to a.
        int max = a;
        // if condition b is greater then max.
        if(b>max){
            // max is equal to b.
         max = b;   
        }
        // if c is greater then max.
        if(c>max){
            // max is equal to c.
            max = c;
        }
        // Printing max.
        System.out.println(max);
    }
    
}
// Expected output is.
// 100
// 465
// 300
// 465
