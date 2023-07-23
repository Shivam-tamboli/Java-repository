import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        // Created scanner class instance.
        Scanner sc = new Scanner(System.in);
        // Taking input from the user as a integer.
        int size = sc.nextInt();
        // Created an array.
        int numbers[] = new int [size];
        // This loop is for The values stores in  an array.
        for(int i = 0; i<size;i++){
            numbers[i] = sc.nextInt();
        }

//      This loop for defining the lenght of an array.
        for(int i = 0; i<size; i++){
        System.out.println("The values of an arrays are:"+numbers[i]);
        }

    }
    
}
// Expected output is.
// 4
// 1
// 2
// 3
// 4
// The values of an arrays are:1
// The values of an arrays are:2
// The values of an arrays are:3
// The values of an arrays are:4