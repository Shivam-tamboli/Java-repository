public class Stringappending {
    public static void main(String[] args) {
        // Stored string in a string builder.
        StringBuilder sb = new StringBuilder("h");
        // Appending e.
        sb.append("e");
        // Appending l.
        sb.append("l");
        // Appending l.
        sb.append("l");
        // Appending o.
        sb.append("o");
        // Printing the stirng.
        System.out.println(sb);
        // Printing the length of the string.
        System.out.println(sb.length());
    }
    
}
// Expected output is.
// hello

