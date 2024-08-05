package July;
import java.util.*;

public class Reverseastring {
    public static String solution(StringBuilder sb){
        // Loop will run mid of the String length,because we have to swap the first with the last element.
        for(int i = 0; i < sb.length() / 2; i++){
            // Replacing the indexs.
            //  index from the front is i.
            int front = i;
            // index of the back  is lenght - 1 - i;
            int back = sb.length() - 1 -i;

            // it will take character from the front.
            char frontchar = sb.charAt(front);
            // it will take character from the back.
            char backchar = sb.charAt(back);
            // Now it will swap.
            //  at the front index backchar will be set.
            sb.setCharAt(front , backchar);
            // at the back index frontchar will be set.
            sb.setCharAt(back, frontchar);

        }
        // it will return the reverse string.
    return sb.toString();

    }

    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("hello");
    // method will be called in result.
       String result = solution(sb);
    // printing result.
        System.out.println(result);
        
    }
    
}
/*Expected intput will be.
("hello");

Expected output will be:
olleh
 */