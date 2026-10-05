public class Palidrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while(i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            
            if(!Character.isLetterOrDigit(left)) {
                i = i + 1;
                continue;
            }
            if(!Character.isLetterOrDigit(right)) {
                j = j - 1;
                continue;
            }

            if(Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            } 

            i = i + 1;
            j = j - 1;
        }
        
        // 2: Added the final return statement
        return true; 
    }

    public static void main(String[] args) {
        // You can test your code here!
        boolean result = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("Is it a palindrome? " + result);
    }
}