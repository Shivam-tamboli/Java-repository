public class Comparingstring {
    public static void main(String[] args) {
       String name1 = "Shivam";
       String name2 = "Shivam";
    // for comparign these strings.
    // s1 > s2 == +ve
    // s1 == s2 = equal
    // s1 < s2 == -ve

    if(name1.compareTo(name2) == 0){
        System.out.println("Strings are equal.");
    }
    else{
        System.out.println("Strings are not equal");
    }
    }
    
}
