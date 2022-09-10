import isomorphic.IsomorphicStringChecker;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class IsomorphicStringCheckerTest {

    @ParameterizedTest
    @CsvSource({"add, egg", "foo, bar"})
    public void checkerShouldReturnTrueIfIsomorphic(String s1, String s2) {
        IsomorphicStringChecker checker = new IsomorphicStringChecker();
        assertThat(checker.isIsomorphic(s1, s2)).isTrue();
    }

    @ParameterizedTest
    @CsvSource({"fooooooooooooo, bar"})
    public void checker_ifNotIsomorphic_ReturnFalse(String s1, String s2) {
        IsomorphicStringChecker checker = new IsomorphicStringChecker();
        assertThatThrownBy(() -> checker.isIsomorphic(s1, s2)).hasMessage("Excesed");
    }
}
