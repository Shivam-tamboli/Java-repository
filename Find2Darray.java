import java.util.*;


public class Find2Darray {
   public static void main(String args[]) {
    // Created a scanner class instance.
       Scanner sc = new Scanner(System.in);
    //    Taking input from the user as an integer for rows.
       int rows = sc.nextInt();
       //    Taking input from the user as an integer for coloums.
       int cols = sc.nextInt();

//      Declared an array.
       int[][] numbers = new int[rows][cols];


       //input
    //    Using loop for the rows.
       for(int i=0; i<rows; i++) {
           //Using loop for the columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }

//    Taking input for the user for finding x.
       int x = sc.nextInt();

//      Using loop for the rows.
       for(int i=0; i<rows; i++) {
        // Using loop for the rows.
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }


     


   }
}

// Expected output is.
// 3
// 3
// 1 2 3 
// 4 2 1
// 1 2 3
// 4
// x found at location (1, 0)