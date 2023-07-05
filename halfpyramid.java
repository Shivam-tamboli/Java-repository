public class halfpyramid {
    public static void main(String[] args) {
        // intiger value.
        int n = 4;
        // Using for loop.
        // With nested loops.
        for(int i = 1; i <=4; i++){
            // Agian for loop.
            for (int j = 1; j <= i; j++ ){
                // Printing star.
                System.out.print("*");

            }
            // Using   System.out.println for printing our stars for next line.
            System.out.println();
        }
        
    }
    
}

// Expected output.
// *
// **
// ***
// ****