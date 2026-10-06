// package Java.ValidPalindrome;

public class ValidPalindrome {

    public static boolean palindromeHelper(int i, int j, String s) {
        while (i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i = i+ 1;
            j = j - 1;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i < j) {
            char left = s.charAt(i), right = s.charAt(j);
            if (left != right) {
                return palindromeHelper(i + 1, j, s) || palindromeHelper(i, j - 1, s);
            }
            else{
                i = i + 1;
                j = j - 1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = validPalindrome("abbaba");
        System.out.println("Is it a palindrome? " + result);
    }
    
}
