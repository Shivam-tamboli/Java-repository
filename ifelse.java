import java.util.Scanner;

public class ifelse {
public static void main(String[] args) {
    // Printing statement,Please enter your age:
    System.out.println("Please enter your age:");
    // Now we have made scanner class object.
    Scanner sc = new Scanner(System.in);
    // Now we have taken input from user.
    int a = sc.nextInt();
    // Using if, if the integer value will be greater then or equal to 18 it will the statement you want to print.
    if(a>=18){
        System.out.println("Adult:");
    }
    // Using else, if our first condition will be false then it will work or print the statement.
    else{
        System.out.println("You are not adult:");

    }
}
    
}

// Expected output.
// Please enter your age:
// 45
// Adult:

// Please enter your age:
// 12
// You are not adult: