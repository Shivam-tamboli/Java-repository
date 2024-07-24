package July;

import java.util.ArrayList;

public class Arraylistoperations {

    public static void main(String[] args) {
        // Created an arraylist.
        ArrayList<String> fruits = new ArrayList<>();
        // Added frutis.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Added frutis at certain index.
        fruits.add(1,"Grappes");
        // Printing which fruit at the second index.
        System.out.println("Element of index 2:" + fruits.get(2));
        // Removed fruits.
        fruits.remove(0);
        fruits.remove("Apple");
        // Printed size of arraylist.
        System.out.println("Size of the arraylist: " + fruits.size());
        // Prinitng fruits.
        System.out.println("Fruits : " + fruits);
        
    }
    
}
