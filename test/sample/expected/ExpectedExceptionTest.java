package sample.expected;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.endsWith;

public class ExpectedExceptionTest {
    // @Ruleを付加するフィールドはpublicフィールドとする
    @Rule
    public ExpectedException expected = ExpectedException.none();

    @Test(expected = IllegalArgumentException.class)
    public void 従来のやり方() {
        throw new IllegalArgumentException("このメッセージは検証できない");
    }

    @Test
    public void ExpectedExceptionを使ったException検証() {
        // 検証する内容を設定
        expected.expect(IllegalArgumentException.class);
        expected.expectMessage("sample");
        expected.expectMessage(endsWith("exception"));

        // Exceptionが発生する処理を実行
        new SampleClass(null);
    }

    static class SampleClass {
        SampleClass(String str) {
            if ( str == null ) {
                throw new IllegalArgumentException("sample exception");
            }
        }
    }
}
