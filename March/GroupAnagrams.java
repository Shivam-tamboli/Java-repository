/* Neet code */
/*Question : Gropu Anagrams - Given an array of strings strs, group the anagrams together. 
You can return the answer in any order. 
Example 1:
Input : strs = {"aabc", "abbc","abcc"}
Output : ["aabc","abbc","abcc"]

Example 2:
Input : strs = {"aabc" ,"abbc","abac",babc}
Output : ["aabc",abac],["abbc","babc"]
*/
package March;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class GroupAnagrams{
                                                             /*Input parameter*/   
public List<List<String>> groupAnagramsCategorizeByFrequency(String[] strs) {

    // Check for empty inputs
    if (strs == null || strs.length == 0)
      return new ArrayList<>();
    // Created a hashmap.
    HashMap<String, List<String>> frequencyStringsMap = new HashMap<>();
    // Iterating in an array.
    for (String str : strs) {

      String frequencyString = getFrequencyString(str);/*a2b1c3 */

      // If the frequency string is present, add the string to the list
      if (frequencyStringsMap.containsKey(frequencyString)) {
        frequencyStringsMap.get(frequencyString).add(str);
      }
      else {
        // else create a new list
        List<String> strList = new ArrayList<>();
        strList.add(str);
        frequencyStringsMap.put(frequencyString, strList);
      }
    }

    return new ArrayList<>(frequencyStringsMap.values());
  }

  private String getFrequencyString(String str) {

    // Frequency buckets
    int[] freq = new int[26];

    // Iterate over each character
    for (char c : str.toCharArray()) {
      freq[c - 'a']++;
    }

    // Start creating the frequency string
    StringBuilder frequencyString = new StringBuilder("");
    char c = 'a';
    for (int i : freq) {
      frequencyString.append(c);
      frequencyString.append(i);
      c++;
    }

    return frequencyString.toString();
}
    public static void main(String[] args) {
        String[] strs = {"aab", "bba", "baa", "abbccc"};
        GroupAnagrams groupAnagrams = new GroupAnagrams();
    List<List<String>> result = groupAnagrams.groupAnagramsCategorizeByFrequency(strs);

    for (List<String> group : result) {
      System.out.println(group);
    }
}
}
// The expected Input will be:
/*  String[] strs = {"aab", "bba", "baa", "abbccc"}; 
 * 
 * The expected output will be:
[aab, baa]
[abbccc]
[bba]
*/