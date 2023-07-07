public class Halfinvertedpyramid {
    public static void main(String[] args) {
    // Intiger value.      
    int n = 4;
    //   outer loop.
       for(int i=n; i>=1; i--) {
        // Innner loop, space printing.
           for(int j=1; j<i; j++) {
            // Printing space.
               System.out.print(" ");
           }

            // Using loop for printing stars.
           for(int j=0; j<=n-i; j++) {
               System.out.print("*");
           }
        //    Using sout for printing next line.
           System.out.println();
       }
   }


  
    }
    
// Expected output.
//   *
//   **
//  ***
// ****

    
