public class Array5 {
    public static void main(String[] args) {
        //Creating an array name of array is marks.
       int [] marks = new int[3];
       marks[0] = 70;
       marks[1] = 80;
       marks[2] = 99;
    //    System.out.println(marks[1]);
    // For prininting an array using loop.
       for(int i = 0; i<3; i++){
        System.out.println(marks[i]);
       }
    }
    
}
// Expected output is.
// 70
// 80
// 99