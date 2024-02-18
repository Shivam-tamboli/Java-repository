package February;

import java.util.Scanner;

// Created a class.
class Algebra{
    // Created a method.
    int add(int a,int b){
        // This method will calculate the ans,the sum of two numbers.
        int ans = a + b;
        // It will return ans.
        return ans;
    }
}

public class Method {
    public static void main(String[] args) {
        // Created a object.
        Algebra obj = new Algebra();
        Scanner Scan = new Scanner(System.in);
        int a = Scan.nextInt();
        int b = Scan.nextInt();
        System.out.println("The sum of two input numbers is:");
        // ans will store the sum of two numbers.
        // through object called add method.
       int ans =  obj.add(a, b);
        // Output.
       System.out.println(ans);

        
    }
    
}
// The expected output will be:
// 5
// 5
// The sum of two input numbers is:
// 10