import java.util.Scanner;

public class Greaternumber {
    public static void main(String[] args) {
        System.out.println("Please enter the value of number1.");
        Scanner sc = new Scanner(System.in);
        // Taking input from the user for number 1.
        int number1 = sc.nextInt();
        System.out.println("Please enter the value of number 2.");
        // Taking input from the user for number 2.
        int number2 = sc.nextInt();
        System.out.println("Please enter the value of number 3.");
        // Taking input from the user for number 1.
        int number3 = sc.nextInt();

        //Using if statement for checking number 1 is greater from others if it is then print number 1. 
        if (number1 > number2 && number1 > number3){
            System.out.println("The greater is number 1:" + number1);
        }
        //Using  else if statement for checking number 2 is greater from others if it is then print number 2.
        else if( number2 > number1 && number2 > number3){
            System.out.println("The greater is number 2:" + number2);
        }
        //Using  else if statement for checking number 3 is greater from others if it is then print number 3.
        else if(number3 > number1 && number3 > number2){
        System.out.println("The greater is number 3:" + number3);
        }
      
        }

        
    }
    


// Expected output:
// Please enter the value of number1.
// 100
// Please enter the value of number 2.
// 32
// Please enter the value of number 3.
// 38
// The greater is number 1: 100

// Please enter the value of number1.
// 100
// Please enter the value of number 2.
// 300
// Please enter the value of number 3.
// 200
// The greater is number 2: 300

// Please enter the value of number1.
// 111
// Please enter the value of number 2.
// 222
// Please enter the value of number 3.
// 333
// The greater is number 3: 333