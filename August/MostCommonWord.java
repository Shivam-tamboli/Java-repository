// LeetCode.
/*
 * 819. Most Common Word
 * 
 * Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 Example 1 : 
 Input : 
 arr = ["shivam  plays badmintoon daily with his friends and shivam  plays chess also."]
 banned = shivam 

 Output : 
 ["plays"]
 */
package August;
import java.util.*;

public class MostCommonWord {

    public static String soluString(String paragraph , String[] banned){
      // created a str var converted paragraph into toLowerCase and remove all "".
     String normallizedStr = paragraph.toLowerCase().replaceAll("[^a-zA-Z]"," ");
      // created a array words i stored previous var in this arr will convert it into words.
      String[] words = normallizedStr.split("\\s+");
      // created a  wordcount. arr words iterating over every word.
      HashMap<String , Integer> wordcount = new HashMap<>();
      // arr words iterating over every word.
      for(String word : words){
        // we will put word in the wordcount,
        // wordcount.getOrDefault - this function will get the frequency of the word if it doesnt exist it assign the freq by 1
        // if the word exist it will get the value first and it will add by 1.
        wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
      }

      // Created a bannedset. passed a parameter, convert from array banned to bannedlist contains(banned words).
      HashSet<String> bannedset = new HashSet<>(Arrays.asList(banned));
      // iterating ban(words) in bannedset.
      for(String ban : bannedset){
        // if the bannedwords exist it will remove it from the wordcount.
        wordcount.remove(ban);
      }

      //it will store the  most freq word form the map..
      String result = " ";
      // it will the hight freq of a word.
      int maxfreq = 0;

      // iterating over wordcount.
      for(Map.Entry<String , Integer> entry : wordcount.entrySet()){
        // var word will store the word from the wordcount.
        String word = entry.getKey();
        // var count will store the frequency of the word.
        int count = entry.getValue();

        // if count is greater then maxfreq.
        if(count > maxfreq){
          // it will update the maxfreq.
          maxfreq = count;
          // it will update the word also.
          result = word;
        }
      }
// we will return the result.
      return result;


  }
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};

        String freqword = soluString(paragraph, banned);
        System.out.println("\"" + freqword + "\"");
        
    }
    
}
/*Expected input will be: 
 *String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
  String[] banned = {"hit"};

  Expected output will be:
  
 */
