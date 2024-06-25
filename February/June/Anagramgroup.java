// Neetcode
// Anagram Groups
// Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
/*Example 1 : 
 * Input : strs = {"aabc","abac","abca","abbc","abcb",abcc}
 * Output : {{"aabc","abac","abca"} , {"abbc","abcb"} ,{"abcc"}}
 * 
 * Example 2 :
 * Input :  strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
 */
package February.June;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagramgroup{
    // return a list of lists strings
     public static List<List<String>> solution(String[] strs) {
        //if strs is  null or empty check, it will return the new arraylist.
    if (strs == null || strs.length == 0)
        return new ArrayList<>();
        // Created a hashmap, key is string and value is list of string.
    Map<String, List<String>> Map = new HashMap<>();
    // for loop it will over the elements of strs.
    for (String str : strs) {
        // It will generate the frequency string. ex - a1b2c1
        String frequencyString = getFrequencyString(str);
        // if map contains the frequency string,it will add the current string to the list with that key.
        if (Map.containsKey(frequencyString)) {
            Map.get(frequencyString).add(str);
        } else {
            List<String> strList = new ArrayList<>();
            strList.add(str);
            Map.put(frequencyString, strList);
        }
    }

    return new ArrayList<>(Map.values());
}

private static String getFrequencyString(String str) {
    int[] count = new int[26];
    for (char c : str.toCharArray()) {
        count[c - 'a']++;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 26; i++) {
        sb.append('#');
        sb.append(count[i]);
    }
    return sb.toString();
}
// Main method.
public static void main(String[] args) {
    // Array contains strings.
    String[] strs = {"tea", "eat", "abc", "ate", "cbd"};

    // Call solution method
    List<List<String>> result = Anagramgroup. solution(strs);
    System.out.println("Anagram groups using sorting method:");
    for (List<String> group : result) {
        System.out.println(group);
    }

    // Call groupAnagramsCategorizeByFrequency method
    List<List<String>> frequencyResult = Anagramgroup.solution(strs);
    System.out.println("Anagram groups using frequency method:");
    for (List<String> group : frequencyResult) {
        System.out.println(group);
    }
}
}
// Expected Input will be:
// String[] strs = {"tea", "eat", "abc", "ate", "cbd"};

// Expected Input will be:
// Anagram groups using sorting method:
// [cbd]
// [abc]
// [tea, eat, ate]
// Anagram groups using frequency method:
// [cbd]
// [abc]
// [tea, eat, ate]