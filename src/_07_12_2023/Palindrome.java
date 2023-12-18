package _07_12_2023;

public class Palindrome {
    public static void main(String[] args) {
        String s = "туткактут";

        System.out.println(isPalindrome(s) ? "Yes" : "NO");
    }


    private static boolean isPalindrome(String s) {
        if(s.length() <= 1)
            return true;

        if(s.charAt(0) == s.charAt(s.length() -1))
            return isPalindrome(s.substring(1, s.length() - 1));


        return false;
    }
}
