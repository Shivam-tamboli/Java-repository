import java.util.*;
public class Greaterfunction {
    // Creater a function taking argunment.
    public static int Namefunction(int a,int b){
        // Using if condition statement.
        if(a>b){
            // it returns a.
            return a;
    }
    else {
        // Return b.
        return b;

    }
        
    }

    public static void main(String[] args) {
        // Created a scanner class object.
        Scanner sc = new Scanner (System.in);
        // Printing statement for a.
        System.out.println("Enter the number");
        // Taking input form the user.
        int a = sc.nextInt();
        // Printing statement for b.
        System.out.println("Enter the number");
        // Taking input form the  user.
        int b = sc.nextInt();
        // Printing statement.
        System.out.println("The greater number is");
        // Calling function.
        System.out.println(Namefunction(a,b));


    }
    
}
    
// Expected output is.
// Enter the number
// 3
// Enter the number
// 4
// The greater number is
// 4