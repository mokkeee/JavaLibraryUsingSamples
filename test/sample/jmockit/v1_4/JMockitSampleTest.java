package sample.jmockit.v1_4;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Test;

/**
 * Date: 13/10/29
 * Time: 0:33
 */
public class JMockitSampleTest {

    @Mocked
    JMockitSample mock;

    @Test
    public void testGetAge() {
        // Mockのコールされる処理の順序と、返却値、呼び出し回数などを設定
        new NonStrictExpectations() {
            {
                // コンストラクタ
                // 指定引数でコールされなければエラー
                new JMockitSample(35, "mokky");

                mock.getName();
                result = "Mock Name";

                mock.getAge();
                times = 3;
                result = 25;
                result = 35;
                result = 45;
            }
        };

        JMockitSample.run();
    }
}
