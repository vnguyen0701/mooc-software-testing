package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    private GHappy gh;
    @BeforeEach
    public void init(){
        gh = new GHappy();
    }

    @ParameterizedTest(name = "TestType={0}, InputString={1}")
    @CsvSource({
            // no gs
            "noGs,sdftre",
            // one g and it's boundaries
            "oneG,gasdfr",
            "oneG,sdfgwer",
            "oneG,asderfg",
    }    )
    public void falseAsserts(String tytType, String inStr){
        boolean result = gh.gHappy(inStr);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest(name = "TestType={0}, InputString={1}")
    @CsvSource({
            //  double Gs and it's boundaries
            "doubleGs,ggasdfr",
            "doubleGs,asdggasdfr",
            "doubleGs,dfehgg",
            // more than one gg
            "moreGGs,ggasdfgg",
            "moreGGs,ggasdfggdf",
            "moreGGs,dfghggasdfggdf",
            // tripple ggs
            "triplleGs,asdgggasdf",
            //mixed gs
            "mixedGs,agsdggasdf",
            "mixedGs,aggsdgasdf",
    }    )
    public void trueAsserts(String tytType, String inStr){
        boolean result = gh.gHappy(inStr);
        Assertions.assertTrue(result);
    }
}
