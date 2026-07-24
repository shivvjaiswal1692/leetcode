public class palindromestring {
    boolean isPalindrome(String s) {
        return fun(s, 0, s.length() - 1);
    }

    boolean fun(String s, int low, int high) {

        int len = high - low + 1;

        if (len == 0 || len == 1)
            return true;

        if (s.charAt(low) != s.charAt(high))
            return false;

        return fun(s, low + 1, high - 1);
    }
}
