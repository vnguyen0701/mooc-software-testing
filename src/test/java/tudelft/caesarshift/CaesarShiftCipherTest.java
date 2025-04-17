package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher shiftIt;

    @BeforeEach
    public void init() {
        shiftIt = new CaesarShiftCipher();
    }

    @ParameterizedTest
    @CsvSource({
            //defaultCase
            "defaultCase,abc,1,bcd",
            //shift boundaries
            "shiftBounds,abc,-1,zab",
            "shiftBounds,abc,0,abc",
            //space
            "spaces,a c,0,a c",
            "spaces,a c,1,b d",
            //emptyMessage
            "emptyMsg,'',1,''",
            //shift over boundary
            "shiftover,abc,26, abc"
    })
    public void validShifting(String testType, String inStr, int shiftPos, String expectedRes) {
        String res = shiftIt.CaesarShiftCipher(inStr, shiftPos);
        Assertions.assertEquals(expectedRes, res);
    }

    @ParameterizedTest
    @CsvSource({
            //invalid MsgInput
            "invalidMsgInput,ABC,1",
            "invalidMsgInput,ab#,1",
            "invalidMsgInput,a1b,1",
            //nulls
            "nullStr,,1"
    })
    public void invalidShifting(String testType, String inStr, int shiftPos) {
        String res = shiftIt.CaesarShiftCipher(inStr, shiftPos);
        Assertions.assertEquals("invalid", res);
    }

}
