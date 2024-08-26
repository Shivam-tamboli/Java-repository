package August;

public class Concatenation {
    public String concatStrings (String name, String lastname){
        return name + lastname;
    }
    public static void main(String[] args) {
        Concatenation object = new Concatenation();
        String result = object.concatStrings("Shivam", "tamboli");
        System.out.println(result);
        
    }
    
}
