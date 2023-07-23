import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        // created scanner class object.
        Scanner sc = new Scanner(System.in);
        // Taking input from the user as a integer value .
        // To print array size.
        int size = sc.nextInt();
        // Created an array name is numbers.
        int numbers[] = new int [size];
        // Using for loop for array.
        for(int i = 0; i <size; i++){
            System.out.println(numbers[i]);
        }
    }
    
}
// Expected output is.
// 7
// 0
// 0
// 0
// 0
// 0
// 0
// 0