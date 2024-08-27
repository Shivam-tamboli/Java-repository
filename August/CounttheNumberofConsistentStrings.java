/*LeetCode
 * 1684. Count the Number of Consistent Strings
 * 
 You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Example 1 :
Input :
allowed = avc;
words = a,c,v,asd,acv,fde;

Output :
4
 */
package August;
import java.util.HashSet;

public class CounttheNumberofConsistentStrings {

    public static Integer solution(String allowed, String[] words){
        // created set,will store char of allwoed.
        HashSet<Character> charcount = new HashSet<>();
        // loop will help to store char one by one.
        for(char c : allowed.toCharArray()){
            // set will add the char.
            charcount.add(c);
        }
        // created var it will count the consistent strings in words.
        int consistentcount = 0;
        // loop in words. ex(ab).
        for(String word : words){
            // created var it will show is the string is consistent or not.
            boolean isconsistent = true;
            // loop will run in inside the word. ex("a","b")
            for(char c : word.toCharArray()){
                // if condidtion,charcount(set) does not contains the word (char).
                if(!charcount.contains(c)){
                    // then the isconsistent will be false.
                    isconsistent = false;
                    // break the loop.
                    break;
                }
            }
            // if string is consistent 
            if(isconsistent == true){
                // then add it into the consistentcount.
                consistentcount++;
            }
        }

        // return consistentcount it will show the how many is consistent.
        return consistentcount;
        
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int result = solution(allowed, words);
        System.out.println(result);
    }
    
}
/*The Expected input will be:
 *   String allowed = "ab";
 *  String[] words = {"ad","bd","aaab","baa","badab"};
 * 
 * The expected output will be:
 * 2
 */