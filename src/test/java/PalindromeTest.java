import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import palindrome.PalindromeChecker;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {




    @Test
    public void palindromeCheckerClassExists() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertThat(palindromeChecker).isNotNull();
    }

    @DisplayName("A valid palindrome must true.")
    @ParameterizedTest
    @ValueSource(strings = {"madam", "hello", "racecar"})
    public void checkPalindromeMustReturnTrueIfWordIsPalindrome(String word) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean isPalindrome = palindromeChecker.isPalindrome(word);

        assertThat(isPalindrome).isTrue();
    }

}
