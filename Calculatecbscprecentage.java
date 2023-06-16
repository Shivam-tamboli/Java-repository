import java.util.Scanner;



public class Calculatecbscprecentage {
 public static void main(String[] args) {
    System.out.println("Enter your Math's subject marks:");
    Scanner sc = new Scanner(System.in);
    int maths = sc.nextInt();
    System.out.println("Enter your Scince subject marks:");
    int scince = sc.nextInt();
    System.out.println("Enter your English subject marks:");
    int english = sc.nextInt();
    System.out.println("Enter your Social Studies subject marks");
    int social = sc.nextInt();
    System.out.println("Enter your Hindi subject marks");
    int hindi = sc.nextInt();
    float total = ((maths + scince + english + social + hindi)/500.0f)*100;
    System.out.println("The percentage is:");
    System.out.println(total);


 }   
}
