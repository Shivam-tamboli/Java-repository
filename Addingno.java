import java.util.Scanner;

public class Addingno {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println(c);

        

    }
    
}
// Expected output.
// Enter the number:
// 5
// Enter the second number:
// 6
// 11