public class Recursion1 {
    // Created a function.
    public static void printNumber(int n){
        // Base case.
        if(n==6){
            return;
        }
        // Printing n.
        System.out.println(n);
        // Calling n.
        printNumber(n+1);
    }
    public static void main(String[] args) {
        // 
        int n = 1;
        // Called the function.
        printNumber(n);
    }
    
}
// Expected output is.
// 1
// 2
// 3
// 4
// 5
