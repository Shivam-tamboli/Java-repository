package February;

import java.util.ArrayList;

public class Arraylistbasic {
    public static void main(String[] args) {
        // Created an array list.
        ArrayList<Integer> list1 = new ArrayList<>();
        // 
        ArrayList<Integer> list2 = new ArrayList<>();
        // Added elements in array list.
        list1.add(1);
        list1.add(2);
        // 
        list2.add(12);
        list2.add(21);

        // Output.
        System.out.println(list1);

        // appending the element.
        list1.add(1,6);
        System.out.println(list1);
        // checking the elemetn.
        System.out.println(list1.contains(67));
        // Added list2 in list1.
        list1.addAll(list2);
        // Output.
        System.out.println(list1);

    
    
    }
    
}
