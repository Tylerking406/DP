/**
 * Palindrome
 */
public class Palindrome {

    static boolean isPalindrome(String s){

        //base case
        int n = s.length();
        if(n<=1)
            return true;
        else{
            //compare first and last charecters if they match we can compare inner characters
            char lastChar = s.toLowerCase().charAt(n-1);
            char firstChar = s.toLowerCase().charAt(0);

            if(lastChar == firstChar)
                return isPalindrome(s.substring(1, n-1));
            else
                return false;
        }
         
    }
    

    public static void main(String[] args) {
        String[] testStrings = {
            "aba",
            "level",
            "Madam",
            "A man, a plan, a canal: Panama",
            "No lemon, no melon",
            "Hello",
            "",
            "a"
        };

        for(String s : testStrings){
            System.out.printf("%s = %b\n",s,isPalindrome(s));
        }
    }
}