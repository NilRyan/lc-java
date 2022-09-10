import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import subsequence.SubsequenceChecker;

public class SubsequenceCheckerTest {

    @Test
    public void checkerShouldExist() {
        SubsequenceChecker.IsSubsequence("s1", "s2");
    }

    @ParameterizedTest
    @CsvSource({"abc, ahbgdc"})
    public void checker_IfSubsequence_ReturnTrue(String s, String t) {
        Assertions.assertThat(SubsequenceChecker.IsSubsequence(s,t)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"axc, ahbgdc"})
    public void checker_IfNotASubsequence_ReturnFalse(String s, String t) {
        Assertions.assertThat(SubsequenceChecker.IsSubsequence(s,t)).isFalse();
    }

}
