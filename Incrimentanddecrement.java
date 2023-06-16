public class Incrimentanddecrement {
    public static void main(String[] args) {
        // intiger a value is 10.
        int a = 10;
        System.out.println("Incrimenting the value of a:");
        // Incrimenting the value of a.
        // First it will incriment then add.
        System.out.println(a++);
        // It has added.
        System.out.println(a);
        // First it will add then it will incriment.
        System.out.println(++a);

        int b = 30;
        System.out.println("Decrementing the value of b:");
        // First it will decrement then it will decrese.
        System.out.println(b--);
        // It has decresed.
        System.out.println(b);
        // First it will decrese then it will decrement.
        System.out.println(--b);
    }
    
}

// Expected output.
// 10
// 11
// 12
// Decrementing the value of b:
// 30
// 29
// 28