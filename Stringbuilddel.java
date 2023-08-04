public class Stringbuilddel {
    public static void main(String[] args) {
        // Crerated a string bulider,and stored string.
    StringBuilder sb = new StringBuilder("Tony");
    // Printing the string.
    System.out.println(sb);

    // Char  at index 0.
    System.out.println(sb.charAt(0));

    // set char at index.
    sb.setCharAt(0,'g');
    System.out.println(sb);

    // inserting in the index.
    sb.insert(0, 's');
    System.out.println(sb);

    // delete in the index.
    sb.delete(0, 3);
    System.out.println(sb);
    }
    
}
// Expected output is.
// Tony
// T
// gony
// sgony
// ny