package palindrome;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {
        String[] wordArray = word.split("");
        int rightSideIndex = wordArray.length - 1;
        for (String s : wordArray) {
            if (!s.equals(wordArray[rightSideIndex])) return false;
            rightSideIndex -= 1;
        }
        return true;
    }
}
