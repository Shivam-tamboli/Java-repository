import java.util.Scanner;
// Created a class function.
public class Function{
    // Function name is printinfo.
    public static void printinfo (String name){
        System.out.println(name);
        return ;
        // It will return nothing .
  }
public static void main(String[] args) {
    // Created a scanner class object.
    Scanner sc = new Scanner(System.in);
    // Taking input from the user as a string.
    String name = sc.next();
    // Giving agrument through the function.
    printinfo(name);
}
}

// Expected output is.
// ABCDEFGHI
// ABCDEFGHI

