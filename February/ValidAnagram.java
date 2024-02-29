/*Valid Anagram
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Example 1:
Input : s = "Single" , t = "mingle"
Output : False

Example : 2
Input : s = "Listen" , t = "Silent"
Output : True
 */
package February;

public class ValidAnagram {
    public static boolean validanagram(String str1 , String str2){
        // Converted both of the string in lower cases to ignore the case match.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Removing all the white spaces from both the strings
        str1 = str1.replace(" "," ");
        str2 = str2.replace(" "," ");
        // Created an array as bucket list.
        int[] count = new int[26];
        // Iterating.
        for(int i = 0;i<str1.length();i++){
            // Filling the bucket.
            count[str1.charAt(i) - 'a']++;

        }
        // Iterating.
        for(int i = 0;i<str2.length();i++){
            // Emptying the bucket.
            count[str2.charAt(i) - 'a']--;
        }
        // Checking the bucket is empty or not.
        for(int counts : count){
            // if it is not empty  then return false.
            if(counts!= 0)
            return false;
            // True.
        }
        return true;
}

// Main method
    public static void main(String[] args) {
        // Two strings given in question.
        String str1 = "listen";
        String str2 = "silent";
        // Output.
        System.out.println(validanagram(str1, str2));
     
    
    }
}
/*The expected input will be:
String str1 = "listen";
String str2 = "silent";

The expected output will be.
true
 */

