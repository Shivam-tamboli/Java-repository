import java.util.Scanner;

public class addnumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("Enter the number for a:");
        int a = sc.nextInt();
        System.out.println("Enter the number for b:");
         int b = sc.nextInt();
        System.out.println("The sum of both number in sum.");
         int sum = a + b;
         System.out.println("The sum of a and b is:" + sum);
    }
    
}
// Expected output is.
// Enter the number for a:
// 33
// Enter the number for b:
// 33
// The sum of both number in sum.
// The sum of a and b is:66