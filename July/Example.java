package July;

public class Example {
    public void greet(){
        System.out.println("Hello World");
    }

    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Example example = new Example();
        example.greet();
        int result = example.add(5 ,3);
        System.out.println(result);
        
    }
    
}
