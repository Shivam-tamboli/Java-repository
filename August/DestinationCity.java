 /*LeetCode
  * 1436. Destination City
  You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi 
  to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, 
there will be exactly one destination city.

Example 1 :
Input : 
paths = [["a","b"] , ["b","e"],["e","g"]]
Output:
g
  */
 package August;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {

    public static String solution(List<List<String>> paths){
        // set will store the starting cities.
       HashSet<String> startcities = new HashSet<>();
    // List of strings will contain cities.
       for(List<String> path : paths){
        // startcities will add path ["London" , "new york"].
        startcities.add(path.get(0));
       }

       for(List<String> path : paths){
        // destination  will add path ["London" , "new york"].
        String destinationcity = path.get(1);
        // startcities doesnt contsins the destinationcity it will return as destinationcity.
        if(!startcities.contains(destinationcity)){
              return destinationcity;
        }

        // if their is no city return null.
       }
       return null;
        
    }
    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
            Arrays.asList("London", "New York"),
            Arrays.asList("New York", "Lima"),
            Arrays.asList("Lima", "Sao Paulo")

        );
        String result =solution(paths);
        System.out.println("\"" + result + "\"");
    }

    
}
/*Expected input will be:
 * List<List<String>> paths = Arrays.asList(
            Arrays.asList("London", "New York"),
            Arrays.asList("New York", "Lima"),
            Arrays.asList("Lima", "Sao Paulo")

        );

THe Expected input will be:
"Sao Paulo"

 */