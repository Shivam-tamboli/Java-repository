package August;

public class Greeting {
    // method returns the string.
    public void solution(String name){
        System.out.println("Hello" + name);
    }
    public static void main(String[] args) {
        // created object of class.
        Greeting greet = new Greeting();
        // calling method through object.
        greet.solution("Shivam");
        
    }
    
}
