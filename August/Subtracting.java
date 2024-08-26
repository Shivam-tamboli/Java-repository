package August;

public class Subtracting {
    public Integer subtract(int a, int b){
        return a - b;
    }
    public static void main(String[] args) {
        Subtracting match = new Subtracting();
        int result = match.subtract(10, 6);
        System.out.println("The Difference between them is : " + result);
        
    }
    
}
