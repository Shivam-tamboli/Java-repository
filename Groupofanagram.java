import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Groupofanagram {
    

    public static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

        if (strs == null || strs.length == 0)
        return new ArrayList<>();

        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        for (String s : strs) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String key = String.valueOf(arr);

        if (!stringAnagramsMap.containsKey(key))
            stringAnagramsMap.put(key, new ArrayList<>());

        stringAnagramsMap.get(key).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
        resultList.add(stringAnagrams.getValue());
        }
        return resultList;
        
    }   
    public static void main(String[] args) { 
        String[] stringArray = {"abbc","ccbba","aaccb"}; // Input 
        List<List<String>> result  = groupAnagramsCategorizeBySorting(stringArray);
        System.out.println("result: " + result); // Output
    }
}