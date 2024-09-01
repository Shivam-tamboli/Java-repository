/*LeetCode 
 1160. Find Words That Can Be Formed by Characters
 
 You are given an array of strings words and a string chars.

A string is good if it can be formed by characters from chars (each character can only be used once).

Return the sum of lengths of all good strings in words.

Example 1 :
Input :
String a = "cat", "mat","bat","sat";
string char = "atcs"

Output : 
6
 */
package August;

import java.util.HashMap;

public class FindWordsThatCanBeFormedbyCharacters {
    public static Integer solution(String[] words , String chars){
        // var will count the lenght of all good strings.
        int totallength  = 0;

        // a map counts Character and his freq.
        HashMap<Character , Integer> charcount = new HashMap<>();
        // iterate in Character's given chars, chars is a string with this method we seperated every character.
        for(char c : chars.toCharArray()){
            // will put into c in charcount, method give the current freq of the char if not exist it will give 0 if exist it 
            // will add by 1.
            charcount.put(c, charcount.getOrDefault(c, 0) +1);
        }
// run loop in words.
        for(String word : words){
// a new map with parameter,prevoius map's character and their freq will copy this map.
            HashMap<Character , Integer> tempmap = new HashMap<>(charcount);
            // create a variable and set as true.
            boolean carForm  = true;
// run loop in character's of word, method seperated the word.
            for(char c : word.toCharArray()){
// if temp.contains this character and temp will get the freq of the char and it is greater then 0 then,
                if(tempmap.containsKey(c) && tempmap.get(c) > 0){
// temp will add this character, get value will give the current freq then we will deduct by one because it has been used.
                    tempmap.put(c, tempmap.get(c) - 1);
// if it fails anyreason the canfrom will turn into false.
                }else{
                    carForm = false;
                    // loop will break.
                    break;
                }
            }
            // if the canfrom is true it can give the totallength + wordlength.
            if(carForm)
            totallength +=word.length();

        }
        // return the lenght of the string.
        return totallength;

    }
    public static void main(String[] args) {
        String[] words = {"cat","bt","hat","tree"};
        String chars = "atach";

        int result = solution(words, chars);
        System.out.println(result);
    }

    
}

// Expected Input will be : 
// String[] words = {"cat","bt","hat","tree"};
// String chars = "atach";

//  Expected output will be :
// 6
