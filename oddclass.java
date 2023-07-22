import java.util.Scanner;
    public class oddclass 
    {
        public static void main(String[] args) 
        {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number you want to check:");
            n = s.nextInt();
            if(n % 2 == 0)
            {
                System.out.println("The given number "+n+" is Even ");
            }
            else
            {
                System.out.println("The given number "+n+" is Odd ");
        }
        }
    }
    
// Checking number is a odd or not
// Enter the number you want to check:3
// The given number 3 is Odd 