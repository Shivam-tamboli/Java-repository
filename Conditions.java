import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        System.out.println("Please enter the value of a.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please enter the value of b.");
        int b = sc.nextInt();
        if(a==b) {
            System.out.println("The value of a and b are equal.");
        }
        else{
        if(a > b){
            System.out.println("a is greater than b");
        } 
        else{
            System.out.println("a is smaller than b");
        }
        }
    }
    
}

// Expected output.

// Please enter the value of a.
// 3
// Please enter the value of b.
// 4
// a is smaller than b

// Please enter the value of a.
// 67
// Please enter the value of b.
// 8
// a is greater than b

// Please enter the value of a.
// 1
// Please enter the value of b.
// 1
// The value of a and b are equal.