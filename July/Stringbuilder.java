package July;

public class Stringbuilder {
    // Using charAt it will print the string exist at the index.
    public static void solution(StringBuilder sb){
        System.out.println(sb.charAt(3));
    }

    // set charAt at index.
    public static void solutionset(StringBuilder sb){
        sb.setCharAt(5, 'p');
        System.out.println(sb);
    }
    // inser the  character.
    public static void solutioninsert(StringBuilder sb){
        sb.insert(4, 'a');
        System.out.println(sb);

    }
    // delete the char.
    public static void solutiondelete(StringBuilder sb){
        sb.delete(4, 6);
        System.out.println(sb);
    }
    // append the character.
    public static void solutionappend(StringBuilder sb){
        sb.append('r');
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Shivam Tamboli");

        // 
        solution(sb);

        // 
        solutionset(sb);
        // 
        solutioninsert(sb);
        // 
        solutiondelete(sb);
        // 
        solutionappend(sb);
        
    }
    
}
