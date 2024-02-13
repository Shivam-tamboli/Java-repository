package February;
import java.util.HashMap;

public class HashMapbasics {
    public static void main(String[] args) {
        // Created hashmap.
        HashMap<String , Integer> map = new HashMap<>();
        // Added key and values into the hashmap.
        map.put("India" , 123);
        map.put("Usa", 134);
        map.put("China" , 567);
        // Output.
        System.out.println(map);

        // Search
        if(map.containsKey("India")){
            System.out.println("It is present:");
        }else{
            System.out.println("It is not present:");
        }
        // Update value.
        map.put("China", 1000);
        System.out.println(map);
        // Checking values,does it exist or not.
        System.out.println(map.get("China"));
        System.out.println( map.get("Uae"));
        // 
        
    }
    
}
