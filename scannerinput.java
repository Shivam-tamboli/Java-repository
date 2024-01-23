import java.util.Scanner;

public class scannerinput {
    public static void main(String[] args) {
        // Created a scanner class.
        Scanner Scan = new Scanner(System.in);
        System.out.println("Taking input form the user:");
        // Asking input for the user.
        System.out.println("Enter the value for a:");
        // Value will store in a.
        int a = Scan.nextInt();
        // Asking input for the user.
        System.out.println("Enter the value for b:");
        // Asking input for the user.
        int b = Scan.nextInt();
        // Value will store in b.
        // Created int sum.
        // It will add the both value and store.
        int sum = a+b;
        // Printing sum
        System.out.println(sum);
    }
    
}

/*
Expected out is:
 Enter the value for a:
45
Enter the value for b:
54
99
 */
