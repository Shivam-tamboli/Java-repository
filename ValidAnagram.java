public class ValidAnagram {
    public static boolean validanagram(String str1 , String str2){
        // Convert both to lower case for ignoring the case match.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Removing white spaces from the anagram.
        str1 = str1.replace(" ","");
        str2 = str2.replace(" ","");
        // Initialize the bucket array from 0 to 26.
        int [] counts  = new int [26];
        // Traversing  each element of str1.
        // Fillig the bucket.
        for(int i = 0; i < str1.length(); i++){
            counts[str1.charAt(i) - 'a']++;
        }
        // Empty the bucket.
        // Decrementing.
        for(int i = 0; i < str2.length(); i++){
            counts[str2.charAt(i) - 'a']--;
        }
        // Final loop checking the bucket is empty or not.
        for(int count : counts){
            if(count != 0);
            return false;
        }
        return true;
}
    public static void main(String[] args) {
        String str1 = "cook";
        String str2 = "look";
        System.out.println(validanagram(str1, str2));
    }

}
// Expected output is:
// True
