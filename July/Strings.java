package July;
import java.util.*;

public class Strings {

 // Method to concatenate two strings with a space in between.
    public static String solution (String firstname ,  String lastname){
    return firstname + " " + lastname;
       }


    
    // Method to print each character of a string on a new line using charAt.
    public static void solutionat(String fullname){
        for(int i = 0; i<fullname.length(); i++)
        System.out.println( fullname.charAt(i));
   
    }

     // Method to compare two strings and print if they are equal or not.
    public static void solutionco(String firstname , String lastname){
        if(firstname.compareTo(lastname) == 0){
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Both strings are not equal;");
        }
    }
    // substring
    public static void solString(String sentence){
        String name = sentence.substring(3 , 7);
        System.out.println(name);
    }

    public static void main(String[] args) {
        String firstname = "Shivam";
        String lastname = "Tamboli";
         // Method to compare two strings and print if they are equal or not.
        String result = solution(firstname, lastname);
         System.out.println(result); // Output: Shivam Tamboli

         String fullname = "Shivam Tamboli";
         String sentence = "My name is shivam";
         // Print each character of fullname on a new line.
        solutionat(fullname);
        
        // Compare firstname and lastname and print if they are equal or not.
        solutionco(firstname, lastname);

        solString(sentence);


        


       
    }
    

}
