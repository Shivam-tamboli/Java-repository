package February.June;

public class Maxvaluearray {
    public static void main(String[] args) {
        // Created an array.
        int arr[] = {12,45,34,76,89};
        // Called method.
        System.out.println(max(arr));

    }

    // Created a static method.
    static int max(int[] arr){
        // suppose maxvalue is equal to arr index 0[12]
        int maxvalue = arr[0];
        // it will iterate over all elements,and it will check what is the maximum value of this array.
        for(int i = 0; i<arr.length;i++){
            // Condition.
            // if arr value is bigger then maxvalue.
            if (arr[i] > maxvalue)
            // so it will become the maximun value.
            maxvalue = arr[i];
        }


        // this method returns a integer maxvalue.
        return maxvalue;
    }
}

/*  The Input:
 * {12,45,34,76,89}
 * The output:
 * 89
 * 
 */

