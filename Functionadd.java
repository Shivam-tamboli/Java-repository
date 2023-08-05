import java.util.Scanner;

public class Functionadd {
    // Created a function,taking argunments.
    public static int calculatesum(int a, int b){
        // sum it contains the sum of a and b.
    int sum = a + b;
        // this function returns the sum.
        return  sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the vlaue for a.
        System.out.println("Enter the value for a:");
        int a = sc.nextInt();
        // enter the value of b.
        System.out.println("Enter the value for b:");
        int b = sc.nextInt();
        // sum contains the sum of a and b.
        int sum = a + b;
        // Printing the sum.
        System.out.println("The sum of a and b is:");
        System.out.println(sum);
    }
    
}

// Expected output is.
// Enter the value for a:
// 5
// Enter the value for b:
// 5
// The sum of a and b is:
// 10