/*Neet Code
 *Is Anagram
  Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
*/

/*Example 1:
 * Input :  s "ten" , t = "net"
 * Output : true
 * 
 * Example 2:
 * Input : s "book" , t = "took"
 * Output : false
 */

package June;



public class Isanagram {

    public static boolean anagram(String str1 , String str2){
        // Converted both strings to lowercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Removed all whitespaces.
        str1 = str1.replace(" ", " ");
        str2 = str2.replace(" ", " ");
        // Created a bucket list.
        int arr[] = new int[26];
        // Iterating over elements one by one the letters and value store into the bucketlist.
        for(int i = 0; i<str1.length(); i++){
            arr[str1.charAt(i) - 'a']++;
        }
        // Now we will empty the bucketlist.
        for(int i =0; i<str2.length(); i++){
            arr[str2.charAt(i) - 'a']--;
        }
        // Last time we will check the bucketlist is empty or not.
        for(int nums : arr){
            if(nums != 0)
                return false;
            }
        return true;

    }

   
   public static void main(String[] args) {
        // Created two strings.
        String str1  = "bat";
        String str2 = "cat";
    // Called method.
        System.out.println(anagram(str1, str2));
        
    }
    
}
/*The expected input will be:
    Input: String str1  = "racecar";
    String str2 = "carerac";

    The Expected output will be:
    true

    The expected input will be:
    String str1  = "bat";
    String str2 = "cat";

    The Expected output will be:
    false
    

 */