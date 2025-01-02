package classTest;

public class RecursiveWord {
    public static void main(String[] args) {
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("Madam I'm Adam"));
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(isPalindrome("A Toyota"));
        System.out.println(isPalindrome("Not a Palindrome"));
        System.out.println(isPalindrome("asdfghfdsa"));
    }

    public static boolean isPalindrome(String in) {
        in = in.replaceAll("[^A-Za-z]", "").toUpperCase();
        return isPalindromeHelper(in);
    }

    public static boolean isPalindromeHelper(String in) {
        if (in.length() <= 1) {
            return true;
        }
        if (in.charAt(0) != in.charAt(in.length() - 1)) {
            return false;
        }
        return isPalindromeHelper(in.substring(1, in.length() - 1));
    }
}

