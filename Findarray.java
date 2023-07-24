import java.util.Scanner;

public class Findarray {
    public static void main(String[] args) {
        // Created a scanner's object.
        Scanner sc = new Scanner(System.in);
        // Taking input form the user as a integer value.
        int size = sc.nextInt();
        // Created an array.
        int numbers[] = new int [size];
        // Using for loop.
        for(int i = 0; i < size; i++){
            numbers[i] =  sc.nextInt();
        }
//      Find the x.
        int x = sc.nextInt();
//      using for loop for finding x index.
        for(int i= 0; i<numbers.length; i++){
            // Using if statement for x.
            if(numbers[i] == x){
                System.out.println("X found in index:"+i);
            }
        }

        
        }
    }
// Expected output is.
// 5
// 1
// 2
// 3
// 4
// 5
// 4
// X found in index:3
