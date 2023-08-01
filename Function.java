import java.util.Scanner;
// Created a function name by printmyname.
public class Function {               
    //            String type argument, agrument is name.
    public static void printmyname (java.lang.String name){
        System.out.println(name);
        return;
//      return.
    }
    public static void main(String[] args) {
        // Created a scanner object.
        Scanner sc = new Scanner(System.in);
        // Taking input from the user as a string.
        java.lang.String name = sc.next();
//         Calling the function and giving the argunment.
        printmyname(name);
    }
    
}
// Expected output is .
// Taking input from the user as a string.
// Shivam
// Shivam
