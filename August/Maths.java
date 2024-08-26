package August;

public class Maths {
    // method with parameters and return types.
    public Integer add(int a , int b){
        return a + b;
    }

    // methods with parameters and return type.
    public Integer mul(int x, int y){
        return x * y;
    }
    // methods with parameter and return type.
    public void fullname(String name){
        System.out.println("Hello" + name);
    }
    public static void main(String[] args) {
        // created an object of the class.
        Maths match = new Maths();
        int result = match.add(3, 7);
        int solution =match.mul(10, 3);
        System.out.println(result);
        System.out.println(solution);
        match.fullname("Shivam");

        
    }
    
}
