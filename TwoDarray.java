import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {
        // Created scanner  class object.
        Scanner sc = new Scanner(System.in);
        // Taking input from the user as an integer value.
        // Taking input for the rows.
        int row = sc.nextInt();
        // Taking input for the coloums.
        int coloum = sc.nextInt();
        // Declaring 2D array.
        int numbers[][] = new int [row][coloum];

        // input
        // rows
        // This loop is for rows.
        for(int i = 0; i<row;i++){
            // This loop is for coloum.
            for(int j = 0;j<coloum;j++){
                // Taking input in an array first input for.
                // i = represents the for rows.
                // j = represents for the coloums.
                numbers [i][j] = sc.nextInt();

            }
        }

        // output
        // similar loops for printing in an 2d array form.
        // i = represents for the rows.
        // j = represents for the coloums.
        // This loop for rows.
        for(int i = 0;i<row;i++){
            // This loop for coloums.
            for(int j = 0;j<coloum;j++){
                // Making in 2D format,or giving space.
                System.out.print(numbers[i][j]+" ");
            }
            // Printig new lines for rows.
            System.out.println();
        }
        

    }
}
// Expected output is.
// 4
// 4
// 1 2 3 4
// 4 3 2 1
// 5 6 7 8
// 8 7 6 5
// 1 2 3 4 
// 4 3 2 1
// 5 6 7 8
// 8 7 6 5