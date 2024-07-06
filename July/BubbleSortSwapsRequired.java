package July;
import java.lang.reflect.Array;
import java.util.*;

public class BubbleSortSwapsRequired {
    public static int  solution(int[] arr){
        // n is length of array.
        int n = arr.length;
        // this will count the swaps.
        int Swapcount = 0;
        // Outerloop.
        for(int i = 0; i<n-1; i++){
            // InnerLoop.
            for(int j = 0; j<n-1; j++){
                // Condition 
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                    Swapcount++;
                    
                   }
            }
          
        }
        // it will return the swap count.
        return Swapcount;
        
    }
    public static void main(String[] args) {
        // Created an array.
        int[] arr = {3,4,2,1,5,6,7}; 
        // Before sorting.
        System.out.println(Arrays.toString(arr));       
        // Swap contains method and paramters.
       int Swap = solution(arr);
       System.out.println("Numbers of swaps required :");
    //    Printing how many swaps took.
       System.out.println(Swap);
    //    Sorted array.
    System.out.println(Arrays.toString(arr));
}
}