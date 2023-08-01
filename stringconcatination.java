public class stringconcatination {
    public static void main(String[] args) {
        // Taking string in a first name.
        String firstname = "Shivam";
        // Taking string in a last name.
        String lastname = "Tamboli";
        // Concatination
        // Taking full name and storing first and last name.
        String fullname = firstname +" " + lastname;
        // Printing the full name.
        System.out.println("The full name is:" +  fullname );
        // Total length of full name.
        // Shivam tamboli.
        System.out.println(fullname.length());

        // charAt
        // Using loop and charAt for priting letter.
        for(int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }
    }
    
}
