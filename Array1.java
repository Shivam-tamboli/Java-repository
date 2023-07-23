public class Array1 {
    public static void main(String[] args) {
        // Created an array.
        int [] marks = new int[3];
        // In arrays i stored marks.
        marks[0] = 76;
        marks[1] = 89;
        marks[2] = 98;
//      Now i am using loop for printing  marks.
        for (int i = 0; i<3; i++){
            System.out.println(marks[i]);
        }
    }
    
}

// Expected output is.
// 76
// 89
// 98