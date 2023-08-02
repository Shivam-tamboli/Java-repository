public class Substring {
    public static void main(String[] args) {
        // Created a string name of string is sentence,and stord string.
        String sentence = "My name is shivam";
        // Created a string name is name and in name using sentence substring,giving index.
        String name = sentence.substring(11, sentence.length());
        // printing name.
        System.out.println(name);
    }
    
}
// Ecpected output is.
// shivam
