public class Recursion {
    // Created a function.
    public static void printNumber(int n){
        // Base case.
        if(n==0){
            return;
        }
        // Printing n.
        System.out.println(n);
        // Calling n.
        printNumber(n-1);
    }
    public static void main(String[] args) {
        // 
        int n = 5;
        // Called the function.
        printNumber(n);
    }
    
}

// Expected output is.
// 5
// 4
// 3
// 2
// 1
